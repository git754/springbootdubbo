package com.cskaoyan.springbootdubbo.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cskaoyan.springbootdubbo.api.DemoService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
