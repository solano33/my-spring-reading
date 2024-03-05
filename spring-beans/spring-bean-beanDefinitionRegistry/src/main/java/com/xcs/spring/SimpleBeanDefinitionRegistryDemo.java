package com.xcs.spring;

import com.xcs.spring.bean.MyBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;

import java.util.Arrays;

/**
 * @author wuhongbin@xiaomi.com
 * @date 2024/1/26 12:09
 */
public class SimpleBeanDefinitionRegistryDemo {

    public static void main(String[] args) {
        SimpleBeanDefinitionRegistry simpleBeanDefinitionRegistry = new SimpleBeanDefinitionRegistry();
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(MyBean.class);
        simpleBeanDefinitionRegistry.registerBeanDefinition("myBean", genericBeanDefinition);
        System.out.println("simpleBeanDefinitionRegistry.getBeanDefinition(\"myBean\") = " + simpleBeanDefinitionRegistry.getBeanDefinition("myBean"));
        System.out.println("simpleBeanDefinitionRegistry.getBeanDefinitionNames() = " + Arrays.toString(simpleBeanDefinitionRegistry.getBeanDefinitionNames()));
        System.out.println("simpleBeanDefinitionRegistry.getBeanDefinitionCount() = " + simpleBeanDefinitionRegistry.getBeanDefinitionCount());
    }
}
