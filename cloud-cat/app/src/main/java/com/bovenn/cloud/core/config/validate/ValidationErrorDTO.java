package com.bovenn.cloud.core.config.validate;

import java.util.ArrayList;
import java.util.List;

public class ValidationErrorDTO {
 
    private List<FieldErrorDTO> fieldErrors = new ArrayList<>();
 
    public ValidationErrorDTO() {
 
    }
 
    public void addFieldError(String path, String message) {
        FieldErrorDTO error = new FieldErrorDTO(path, message);
        fieldErrors.add(error);
    }
 
    //Getter is omitted.
}