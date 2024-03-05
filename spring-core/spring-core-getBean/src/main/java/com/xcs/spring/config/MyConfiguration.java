package com.xcs.spring.config;

import com.xcs.spring.service.MyServiceC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xcs
 * @date 2023年09月19日 16时35分
 **/
@Configuration
@ComponentScan("com.xcs.spring.service")
public class MyConfiguration {

//    @Bean(name = {"myServiceC111", "myServiceCAlis111"})
//    public MyServiceC myServiceC() {
//        System.out.println("myServiceC执行");
//        return new MyServiceC();
//    }
//
//    @Bean(name = {"myServiceCAlis111", "myServiceCAlis222"})
//    public MyServiceC myServiceC2() {
//        System.out.println("myServiceC2执行");
//        return new MyServiceC();
//    }
}
