package com.xfinity.interview.exception;

public class SetContainsDuplicateException extends RuntimeException {

	private static final long serialVersionUID = -2717845608959426243L;
	private final String message = "The Set of Strings cannot contain any duplicate values.";
	
	public SetContainsDuplicateException() {
		super();
	}
	
	public SetContainsDuplicateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	public SetContainsDuplicateException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public SetContainsDuplicateException(String message) {
		super(message);
	}
	
	public SetContainsDuplicateException(Throwable cause) {
		super(cause);
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getMessage() {
		return message;
	}
	
}
