package com.utc2.fuochung.employee_management.handler;

public class BadRequestException extends HandledException {
    public BadRequestException() {
        super("Bad Request.", 400);
    }

    public BadRequestException(String message) {
        super(message, 400);
    }

    public BadRequestException(String message, int code) {
        super(message, code);
    }
}
