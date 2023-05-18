package com.utc2.fuochung.employee_management.handler;

import lombok.Getter;

@Getter
public class HandledException extends Exception {
    private final int code;

    public HandledException(String message, int code) {
        super(message);
        this.code = code;
    }

    HandledException(String message, int code, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }
}
