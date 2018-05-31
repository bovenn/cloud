package com.bovenn.cloud.core.config.validate;

import com.bovenn.cloud.common.model.InvokeResult;
import com.bovenn.cloud.common.model.exception.BizException;
import com.bovenn.cloud.common.model.exception.rest.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Locale;

@ControllerAdvice
public class RestErrorHandler {
    private Logger logger = LoggerFactory.getLogger(RestErrorHandler.class);

    private MessageSource messageSource;
    @Autowired
    public RestErrorHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    /**
     * 业务异常判定
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(BizException.class)
    public Object restStatusException(BizException e) {
        return InvokeResult.valueOf(e.getRestStatus());
    }
    /**
     * 内部错误异常
     * @param e
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object exception(Exception e) {
        logger.error(e.getMessage(), e);
        return InvokeResult.error();
    }

    /**
     * 认证异常
     * @param e
     * @return
     */
//    @ResponseBody
//    @ExceptionHandler(BadCredentialsException.class)
//    public Object authException(Exception e) {
//        logger.error(e.getMessage());
//        InvokeResult invokeResult =  InvokeResult.status(StatusCode.INVALID_AUTH);
//        invokeResult.setMsg("用户名或密码错误!");
//        return invokeResult;
//    }

    /**
     * 权限异常
     * @param e
     * @return
     */
//    @ResponseBody
//    @ExceptionHandler(AccessDeniedException.class)
//    public Object unauthorizedException(Exception e) {
//        logger.error(e.getMessage());
//        InvokeResult invokeResult =  InvokeResult.status(StatusCode.UNAUTHORIZED);
//        invokeResult.setMsg("无权访问!");
//        return invokeResult;
//    }

    /**
     * 提交参数验证异常
     * @param ex
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Object processValidationError(MethodArgumentNotValidException ex) {
        BindingResult result = ex.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();

        InvokeResult invokeResult = InvokeResult.status(StatusCode.INVALID_MODEL_FIELDS);
        invokeResult.setMsg(processFieldErrors(fieldErrors));
        return invokeResult;
    }

    private String processFieldErrors(List<FieldError> fieldErrors) {
        // ValidationErrorDTO dto = new ValidationErrorDTO();
        StringBuffer sb = new StringBuffer();
        for (FieldError fieldError: fieldErrors) {
            String localizedErrorMessage = resolveLocalizedErrorMessage(fieldError);
            sb.append(localizedErrorMessage);
            sb.append(";");
            //dto.addFieldError(fieldError.getField(), localizedErrorMessage);
        }
        return sb.toString();
    }

    private String resolveLocalizedErrorMessage(FieldError fieldError) {
        Locale currentLocale =  LocaleContextHolder.getLocale();
        String localizedErrorMessage = messageSource.getMessage(fieldError, currentLocale);

        //If the message was not found, return the most accurate field error code instead.
        //You can remove this check if you prefer to get the default error message.
    /*    if (localizedErrorMessage.equals(fieldError.getDefaultMessage())) {
            String[] fieldErrorCodes = fieldError.getCodes();
            localizedErrorMessage = fieldErrorCodes[0];
        }*/
        return localizedErrorMessage;
    }
}