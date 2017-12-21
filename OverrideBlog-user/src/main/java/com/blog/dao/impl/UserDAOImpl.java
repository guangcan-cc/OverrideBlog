package com.blog.dao.impl;

import com.blog.dao.IUserDAO;
import com.blog.exception.NonePrintException;
import com.blog.vo.UserInfoVO;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements IUserDAO{
    @Override
    public UserInfoVO findUserInfoVOById(int id) throws NonePrintException {
        return null;
    }

    @Override
    public void insertUserInfoVO(UserInfoVO userInfoVO) {

    }
}
