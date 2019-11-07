package com.yuzhi.msaccount.service.impl;

import com.yuzhi.msaccount.domain.entity.User;
import com.yuzhi.msaccount.mapper.UserMapper;
import com.yuzhi.msaccount.service.AccontService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yuzhi
 */
@Service
public class AccontServiceImpl implements AccontService {
    @Resource
    UserMapper userMapper;
    @Override
    public User findUserById(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }
}
