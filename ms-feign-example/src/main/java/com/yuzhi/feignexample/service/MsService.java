package com.yuzhi.feignexample.service;

import com.yuzhi.feignexample.domain.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

/**
 * @author yuzhi
 */
@FeignClient("ms-account")
public interface MsService {
    @RequestMapping("/user?uid={uid}")
    User getData(@PathVariable Integer uid);
}
