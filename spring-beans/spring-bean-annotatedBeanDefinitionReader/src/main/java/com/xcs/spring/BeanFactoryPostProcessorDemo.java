package com.xcs.spring;

import com.xcs.spring.bean.MyBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;

/**
 * @author wuhongbin@xiaomi.com
 * @date 2024/1/29 16:58
 */
public class BeanFactoryPostProcessorDemo {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(beanFactory);
        reader.registerBean(MyBean.class);
        MyBean bean = beanFactory.getBean(MyBean.class);
        System.out.println("bean = " + bean);
        Object processorBean = beanFactory.getBean("org.springframework.context.annotation.internalConfigurationAnnotationProcessor");
        System.out.println("processorBean = " + processorBean);
    }
}
