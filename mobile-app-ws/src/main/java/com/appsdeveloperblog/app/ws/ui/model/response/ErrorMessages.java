package com.appsdeveloperblog.app.ws.ui.model.response;

public enum ErrorMessages {

    MISSING_REQUIRED_FIELDS("Missing required field. Please check documentation for required field");

    private String errorMessage;

    ErrorMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
