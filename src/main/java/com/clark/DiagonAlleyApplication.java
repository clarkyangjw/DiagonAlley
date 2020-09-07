package com.clark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.clark.mapper")
public class DiagonAlleyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiagonAlleyApplication.class, args);
    }

}
