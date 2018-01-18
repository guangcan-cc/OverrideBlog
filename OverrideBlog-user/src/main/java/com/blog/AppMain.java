package com.blog;

import com.blog.exception.NonePrintException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//@MapperScan(basePackages = {"com.blog.mapper"})
public class AppMain {

    public static void main(String[] args) throws NonePrintException {

        SpringApplication.run(AppMain.class);

    }
}
