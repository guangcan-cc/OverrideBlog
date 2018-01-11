package com.blog.exception;

/**
 * Created by Elvis on 2017/8/30.
 */
public class NonePrintException extends BaseException{

    public NonePrintException(String code, String msg) {
        super(code, msg);
    }

    public NonePrintException(String code, String msg, String bussinessMsg) {
        super(code, msg, bussinessMsg);
    }

    public NonePrintException(int code, String msg) {
        super(code, msg);
    }

    public NonePrintException(int code, String msg, String bussinessMsg) {
        super(code, msg, bussinessMsg);
    }

    public NonePrintException(String code, String msg, Throwable exception) {
        super(code, msg, exception);
    }

    public NonePrintException(String code, String msg, String bussinessMsg, Throwable exception) {
        super(code, msg, bussinessMsg, exception);
    }
}
