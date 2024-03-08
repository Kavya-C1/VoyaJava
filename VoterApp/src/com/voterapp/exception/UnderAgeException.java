package com.voterapp.exception;

public class UnderAgeException extends NotEligibleException {

    public UnderAgeException(String message) {
        super(message);
    }
}
