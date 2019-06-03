package com.cskaoyan.springbootdubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootdubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdubboApplication.class, args);
    }

}
