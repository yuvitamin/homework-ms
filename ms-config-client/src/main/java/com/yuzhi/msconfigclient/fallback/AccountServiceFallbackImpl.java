package com.yuzhi.msconfigclient.fallback;

import com.yuzhi.msconfigclient.domain.dto.AccountDto;
import com.yuzhi.msconfigclient.service.AccountService;
import org.springframework.stereotype.Component;

/**
 * @author yuzhi
 */
@Component
public class AccountServiceFallbackImpl implements AccountService {
    @Override
    public AccountDto getAccountData(Integer uid) {
        AccountDto accountDto = new AccountDto(100, "熔断了",
                "没密码", "18888888888", 100);
        return accountDto;
    }
}
