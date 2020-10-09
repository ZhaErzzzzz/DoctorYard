package com.four;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.four")
@EnableDubbo //开启dubbo的注解支持
public class DoctoryardControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoctoryardControllerApplication.class, args);
    }

}
