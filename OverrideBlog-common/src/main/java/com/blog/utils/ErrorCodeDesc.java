package com.blog.utils;

/**
 * Created by Elvis on 2017/8/31.
 */
public enum ErrorCodeDesc {
    SYSTEM_ERROR("-1","系统出现异常，请稍后再试！");


    private String code;
    private String desc;
    ErrorCodeDesc(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
