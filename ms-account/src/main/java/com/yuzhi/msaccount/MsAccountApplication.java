package com.yuzhi.msaccount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.yuzhi.msaccount.mapper")
@EnableDiscoveryClient
public class MsAccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsAccountApplication.class, args);
    }
}
