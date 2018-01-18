package com.blog.web.controller;

import com.blog.exception.NonePrintException;
import com.blog.service.IUserService;
import com.blog.util.ResultCodeDesc;
import com.blog.util.UploadFileUtils;
import com.blog.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/register")
    public Map<String, Object> register(MultipartFile uploadHeadFile, UserInfoVO userInfoVO){

        Map<String, Object> resultMap = new HashMap<>();

        try {
            //先上传文件
            UploadFileUtils.uploadFile(uploadHeadFile, "user");
            //再注册
            userService.register(userInfoVO);
            resultMap.put(ResultCodeDesc.CODE,ResultCodeDesc.SUCCESS);

        } catch (NonePrintException e) {
            resultMap.put(ResultCodeDesc.CODE,e.getErrCode());
            resultMap.put(ResultCodeDesc.MSG,e.getErrMsg());
        }

        return resultMap;
    }

    @RequestMapping("/login")
    public void login(){

    }
}
