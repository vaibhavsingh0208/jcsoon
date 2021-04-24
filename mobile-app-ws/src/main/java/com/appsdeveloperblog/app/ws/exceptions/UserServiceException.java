package com.appsdeveloperblog.app.ws.exceptions;

public class UserServiceException extends RuntimeException{

    private static final long serialVersionUID = 134877110917143607L;

    public UserServiceException(String message) {
        super (message);
    }
}

