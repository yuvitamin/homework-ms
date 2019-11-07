package com.yuzhi.msconfigclient.service;

import com.yuzhi.msconfigclient.domain.dto.AccountDto;
import com.yuzhi.msconfigclient.fallback.AccountServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuzhi
 */
@FeignClient(value = "ms-account",fallback = AccountServiceFallbackImpl.class)
public interface AccountService {
    @RequestMapping("/user?uid={uid}")
    AccountDto getAccountData(@PathVariable Integer uid);
}
