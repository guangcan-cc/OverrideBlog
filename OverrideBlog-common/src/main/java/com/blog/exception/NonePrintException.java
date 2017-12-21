package com.blog.exception;

public class NonePrintException extends Exception{

    public NonePrintException() {
    }

    public NonePrintException(String message) {
        super(message);
    }

    public NonePrintException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonePrintException(Throwable cause) {
        super(cause);
    }

    public NonePrintException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
