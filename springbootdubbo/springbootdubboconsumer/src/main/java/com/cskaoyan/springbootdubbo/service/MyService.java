package com.cskaoyan.springbootdubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cskaoyan.springbootdubbo.api.DemoService;
import org.springframework.stereotype.Component;

@Component("myService")
public class MyService {

    //(url = "dubbo://localhost:20880")
    @Reference
    DemoService demoService;

    public void doSth(){

        String ret = demoService.sayHello("zhangsan");

        System.out.println("consumer result="+ret);

    }
}
