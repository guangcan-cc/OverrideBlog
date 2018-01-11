package com.blog.exception;

import com.blog.util.AssertUtils;

/**
 * Created by Elvis on 2017/8/30.
 */
public class BaseException extends Throwable {
    private static final long serialVersionUID = 6937304029901546157L;
    private String errMsg = "";
    private String errCode = "";
    private String bussinessMsg;

    public BaseException() {
        this.initCause((Throwable) null);
    }

    public BaseException(Throwable exception) {
        super(exception);
    }

    public BaseException(String msg, Throwable exception) {
        super(msg, exception);
        this.errMsg = msg;
    }

    public BaseException(String code, String msg, Throwable exception) {
        super(msg, exception);
        this.errMsg = msg;
        this.errCode = code;
    }

    public BaseException(String code, String msg, String bussinessMsg, Throwable exception) {
        super(msg, exception);
        this.errMsg = msg;
        this.errCode = code;
        this.bussinessMsg = bussinessMsg;
    }

    public BaseException(String code, String msg) {
        super(msg);
        this.errMsg = msg;
        this.errCode = code;
    }

    public BaseException(String code, String msg, String bussinessMsg) {
        super(msg);
        this.errMsg = msg;
        this.errCode = code;
        this.bussinessMsg = bussinessMsg;
    }

    public BaseException(int code, String msg) {
        super(msg);
        this.errMsg = msg;
        this.errCode = String.valueOf(code);
    }

    public BaseException(int code, String msg, String bussinessMsg) {
        super(msg);
        this.errMsg = msg;
        this.errCode = String.valueOf(code);
        this.bussinessMsg = bussinessMsg;
    }

    public BaseException(String msg) {
        super(msg);
        this.errMsg = msg;
    }

    public String getMessage() {
        return AssertUtils.isEmpty(this.errMsg) ? super.getMessage() : this.errMsg;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public String getBussinessMsg() {
        return this.bussinessMsg;
    }

    public void setBussinessMsg(String bussinessMsg) {
        this.bussinessMsg = bussinessMsg;
    }
}
