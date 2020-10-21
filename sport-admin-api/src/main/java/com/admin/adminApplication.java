package com.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description: 体育管理系统启动类
 * @auther: xrq
 * @date: 2020/10/21 12:06
 */
@Slf4j
@SpringBootApplication
@EnableSwagger2
public class adminApplication {
    public static void main(String[] args) {
        SpringApplication.run(adminApplication.class, args);
        log.info("体育后台管理系统启动成功！");
    }
}
