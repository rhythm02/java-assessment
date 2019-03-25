package com.hashmap.assessment.exception;

public class NoLeaveException extends RuntimeException{
    private String msg;
    public NoLeaveException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
