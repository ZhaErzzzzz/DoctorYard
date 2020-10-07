package com.four;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.four")
public class DoctoryardControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoctoryardControllerApplication.class, args);
    }

}
