package com.bjpowernode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class Application {

    public static void main(String[] args) {
            System.out.println("桂林市 桂林米粉");

        SpringApplication.run(Application.class, args);
    }
}

