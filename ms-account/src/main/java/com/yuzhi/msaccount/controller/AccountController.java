package com.yuzhi.msaccount.controller;

import com.yuzhi.msaccount.domain.entity.User;
import com.yuzhi.msaccount.service.AccontService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuzhi
 */
@RestController
@RefreshScope
public class AccountController {
    @Resource
    AccontService accontService;
    @RequestMapping("/user")
    public User findUser(Integer uid){
       return accontService.findUserById(uid);
    }
}
