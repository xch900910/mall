package com.xch900910.mall.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xch900910
 * @version 1.0
 * @Desc
 * @Date 2020/5/3 17:31
 **/
@SpringBootApplication(scanBasePackages = "com.xch900910.mall")
public class MallWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallWebApplication.class, args);
    }
}
