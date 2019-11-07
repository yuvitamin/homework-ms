package com.yuzhi.msconfigclient.domain.dto;

import lombok.Data;

/**
 * @author yuzhi
 */
@Data
public class AccountDto {
    private Integer uId;

    private String uUsername;

    private String uPassword;

    private String uPhone;

    private Integer sId;

    public AccountDto(Integer uId, String uUsername, String uPassword, String uPhone, Integer sId) {
        this.uId = uId;
        this.uUsername = uUsername;
        this.uPassword = uPassword;
        this.uPhone = uPhone;
        this.sId = sId;
    }
}
