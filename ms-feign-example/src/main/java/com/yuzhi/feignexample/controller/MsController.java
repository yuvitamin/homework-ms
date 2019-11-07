package com.yuzhi.feignexample.controller;

import com.yuzhi.feignexample.domain.entity.User;
import com.yuzhi.feignexample.service.MsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuzhi
 */
@RestController
@Slf4j
public class MsController {
    @Resource
    MsService msService;
    @RequestMapping("/ms/{uid}")
    public User userOrders(@PathVariable Integer uid) {
        User data = msService.getData(uid);
        return data;

    }

}
