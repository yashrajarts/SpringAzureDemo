package com.yash.yashraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class YashRajApplication {
    @GetMapping("/message")
    public String message(){
        return "Hello This is Yash, Welcome to Azure";
    }
    public static void main(String[] args) {
        SpringApplication.run(YashRajApplication.class, args);

    }
}