package com.xcs.spring;

import com.xcs.spring.config.MyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author xcs
 * @date 2023年09月16日 16时09分
 **/
public class GetBeanApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        System.out.println("myServiceA = " + context.getBean("myServiceA"));
        System.out.println("myServiceB = " + context.getBean("myServiceB"));
        System.out.println("myServiceDFactory = " + context.getBean("myServiceDFactory"));
        System.out.println("&myServiceDFactory = " + context.getBean("&myServiceDFactory"));
//        System.out.println("myServiceCAlis = " + context.getBean("myServiceCAlis111"));
//
//        System.out.println();
//
//        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
//            String[] aliases = context.getAliases(beanDefinitionName);
//            System.out.println("beanDefinitionName = " + beanDefinitionName + ", alias = " + Arrays.toString(aliases));
//        }
//
//        System.out.println();
    }
}
