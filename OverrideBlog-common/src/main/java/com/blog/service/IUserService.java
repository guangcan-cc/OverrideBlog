package com.blog.service;

import com.blog.exception.NonePrintException;
import com.blog.vo.UserInfoVO;

public interface IUserService {

    void register(UserInfoVO userInfoVO) throws NonePrintException;
}
