package com.yuzhi.msconfigclient.controller;

import com.yuzhi.msconfigclient.domain.vo.UserVo;
import com.yuzhi.msconfigclient.service.MsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuzhi
 */
@RestController
@Slf4j
@RefreshScope
public class MsController {
    @Resource
    MsService msService;
    @RequestMapping("/ms/{uid}")
    public UserVo userOrders(@PathVariable Integer uid) {
        UserVo data = msService.getData(uid);
        return data;
    }
}
