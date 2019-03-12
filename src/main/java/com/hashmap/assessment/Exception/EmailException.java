package com.hashmap.assessment.Exception;

public class EmailException extends RuntimeException {
    private String msg;
    public EmailException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
