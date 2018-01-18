package com.blog.util;

/**
 * Created by Elvis on 2017/8/31.
 */
public enum ErrorCodeDesc {
    SYSTEM_ERROR("-1","系统出现异常，请稍后再试！"),
    USER_NOT_EXIST("1001","用户名已存在！"),
    FILE_UPLOAD_ERROR("1002","上传文件失败，请重新再试！");


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
