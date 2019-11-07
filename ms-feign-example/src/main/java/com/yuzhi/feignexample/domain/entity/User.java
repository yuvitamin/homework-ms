package com.yuzhi.feignexample.domain.entity;

import lombok.Data;

/**
 * @author yuzhi
 */
@Data
public class User {
    private Integer uId;

    private String uUsername;

    private String uPassword;

    private String uPhone;

    private Integer sId;
}