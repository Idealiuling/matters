package com.customer.matters;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.customer.matters.dao")
public class MattersApplication {

    public static void main(String[] args) {

        SpringApplication.run(MattersApplication.class, args);
    }

}
