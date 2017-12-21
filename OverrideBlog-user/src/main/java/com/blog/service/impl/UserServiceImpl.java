package com.blog.service.impl;

import com.blog.dao.IUserDAO;
import com.blog.exception.NonePrintException;
import com.blog.service.IUserService;
import com.blog.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    @Override
    public void register(UserInfoVO userInfoVO) throws NonePrintException {

        UserInfoVO _userInfoVO = userDAO.findUserInfoVOById(userInfoVO.getId());

        if(_userInfoVO != null) {
            throw new NonePrintException("该用户名已存在！");
        }

        userDAO.insertUserInfoVO(_userInfoVO);
    }
}
