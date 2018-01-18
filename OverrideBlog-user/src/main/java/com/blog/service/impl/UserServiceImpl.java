package com.blog.service.impl;

import com.blog.mapper.UserMapper;
import com.blog.exception.NonePrintException;
import com.blog.service.IUserService;
import com.blog.util.ErrorCodeDesc;
import com.blog.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class UserServiceImpl implements IUserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void register(UserInfoVO userInfoVO) throws NonePrintException {

        UserInfoVO _userInfoVO = userMapper.findUserInfoVOById(userInfoVO.getId());

        if(_userInfoVO != null) {
            throw new NonePrintException(ErrorCodeDesc.USER_NOT_EXIST.getCode(), ErrorCodeDesc.USER_NOT_EXIST.getDesc());
        }

        userMapper.insertUserInfoVO(userInfoVO);
    }
}
