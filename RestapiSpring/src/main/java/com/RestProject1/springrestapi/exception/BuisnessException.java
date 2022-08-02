package com.RestProject1.springrestapi.exception;

import org.springframework.stereotype.Component;

@Component
public class BuisnessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorCode;
	private String errorMessage;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "BuisnessException [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}
	public BuisnessException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public BuisnessException() {
		super();
		// TODO Auto-generated constructor stub
	}


}
