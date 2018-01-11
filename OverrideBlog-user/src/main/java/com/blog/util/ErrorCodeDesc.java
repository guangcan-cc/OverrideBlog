package com.blog.util;

/**
 * Created by Elvis on 2017/8/31.
 */
public enum ErrorCodeDesc {
    USER_NOT_EXIST("1001","用户名已存在！");


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
