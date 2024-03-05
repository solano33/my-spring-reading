package com.xcs.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author wuhongbin@xiaomi.com
 * @date 2024/2/4 15:20
 */
@Component
public class MyServiceC {

    @Autowired
    private MyServiceB myServiceB;

    @Override
    public String toString() {
        return "MyServiceC{" +
                "myServiceB=" + myServiceB +
                '}';
    }
}
