package com.bovenn.cloud.common.model.exception.ioc;

/**
* @Description: 当试图获取在IoC容器中不存在的Bean实例时抛出此异常。
* @author kissy
* @date 2017/10/24 下午4:45
*/
public class IocInstanceNotFoundException extends IocException {

	private static final long serialVersionUID = -742775077430352894L;

	public IocInstanceNotFoundException() {
	}

	public IocInstanceNotFoundException(String message) {
		super(message);
	}

	public IocInstanceNotFoundException(Throwable cause) {
		super(cause);
	}

	public IocInstanceNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}