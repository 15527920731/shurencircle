package com.shurencircle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shurencircle.mapper")
public class ShurencircleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShurencircleApplication.class, args);
    }
}
