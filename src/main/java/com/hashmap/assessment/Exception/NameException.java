package com.hashmap.assessment.Exception;

import com.hashmap.assessment.utility.ValidateEmail;

public class NameException extends RuntimeException {
    private String msg;
    public NameException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
