package com.yuzhi.msconfigclient.service.impl;

import com.yuzhi.msconfigclient.domain.dto.AccountDto;
import com.yuzhi.msconfigclient.domain.vo.UserVo;
import com.yuzhi.msconfigclient.service.AccountService;
import com.yuzhi.msconfigclient.service.MsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yuzhi
 */
@Service
public class MsServiceImpl implements MsService {
    @Resource
    AccountService accountService;
    @Override
    public UserVo getData(Integer uid) {
        AccountDto accountData = accountService.getAccountData(uid);
        UserVo userVo = new UserVo();
        userVo.setAccountDto(accountData);
        return userVo;
    }
}
