package com.org.hotel.exceptions;

public class ResourecNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ResourecNotFoundException(String s) {
		super(s);
	}
	
	public ResourecNotFoundException() {
		super("Resource not found");
	}

}
