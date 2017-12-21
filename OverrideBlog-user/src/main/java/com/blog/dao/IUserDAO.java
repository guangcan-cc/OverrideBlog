package com.blog.dao;

import com.blog.exception.NonePrintException;
import com.blog.vo.UserInfoVO;

public interface IUserDAO {

    UserInfoVO findUserInfoVOById(int id) throws NonePrintException;

    void insertUserInfoVO(UserInfoVO userInfoVO);
}
