package com.blog.mapper;

import com.blog.vo.UserInfoVO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    UserInfoVO findUserInfoVOById(Long id);

    int insertUserInfoVO(UserInfoVO userInfoVO);
}
