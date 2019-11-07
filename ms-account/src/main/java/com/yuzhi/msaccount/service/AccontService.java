package com.yuzhi.msaccount.service;

import com.yuzhi.msaccount.domain.entity.User;

/**
 * @author yuzhi
 */
public interface AccontService {
    User findUserById(Integer uid);
}
