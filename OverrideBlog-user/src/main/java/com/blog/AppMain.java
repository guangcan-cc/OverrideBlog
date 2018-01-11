package com.blog;

import com.blog.exception.NonePrintException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class AppMain {

    public static void main(String[] args) throws NonePrintException {

        SpringApplication.run(AppMain.class);

    }
}
