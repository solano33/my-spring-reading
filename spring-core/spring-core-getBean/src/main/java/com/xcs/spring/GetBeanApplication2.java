package com.xcs.spring;

import com.xcs.spring.config.MyConfiguration;
import com.xcs.spring.service.MyServiceA;
import com.xcs.spring.service.MyServiceB;
import com.xcs.spring.service.MyServiceC;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author xcs
 * @date 2023年09月16日 16时09分
 **/
public class GetBeanApplication2 {

    public static void main(String[] args) {
        GenericApplicationContext applicationContext = new GenericApplicationContext();
        applicationContext.registerBean("myServiceA", MyServiceA.class);
        applicationContext.registerBean("myServiceB", MyServiceB.class);
        applicationContext.registerBean("myServiceC", MyServiceC.class);

        applicationContext.registerBean(AutowiredAnnotationBeanPostProcessor.class);

        applicationContext.refresh();

        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println("beanDefinitionName = " + applicationContext.getBean(beanDefinitionName));
        }
    }
}
