package com.bovenn.cloud.common.model.exception.ioc;

/**
* @Description: IoC容器异常。当访问IoC容器（Spring，Guice等）发生异常时抛出本异常或其子类实例。
* @author kissy
* @date 2017/10/24 下午4:44
*/
public class IocException extends RuntimeException {

	private static final long serialVersionUID = -2359843215972162510L;

	public IocException() {
	}

	public IocException(String message) {
		super(message);
	}

	public IocException(Throwable cause) {
		super(cause);
	}

	public IocException(String message, Throwable cause) {
		super(message, cause);
	}

}
