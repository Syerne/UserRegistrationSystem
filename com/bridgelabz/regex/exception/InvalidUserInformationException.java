package com.bridgelabz.regex.exception;

public class InvalidUserInformationException extends RuntimeException {
    public InvalidUserInformationException(String msg) {
        super(msg);
    }
    public InvalidUserInformationException() {
        super();
    }

}
