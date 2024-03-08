package com.voterapp.exception;

public class InvalidVoterIdException extends NotEligibleException {
    public InvalidVoterIdException(String message) {
        super(message);
    }


}
