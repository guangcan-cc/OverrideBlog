package com.blog.mapper;

import com.blog.vo.UserInfoVO;

public interface UserMapper {

    UserInfoVO findUserInfoVOById(Long id);

    int insertUserInfoVO(UserInfoVO userInfoVO);
}
