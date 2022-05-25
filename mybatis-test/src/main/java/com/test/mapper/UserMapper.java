package com.test.mapper;

import com.test.entity.User;

public interface UserMapper {

    User selectById(Integer id);

    void updateForName(String id,String username);
}
