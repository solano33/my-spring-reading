package com.xcs.spring.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author wuhongbin@xiaomi.com
 * @date 2024/2/4 15:20
 */
@Component
public class MyServiceDFactory implements FactoryBean<MyServiceD> {
    @Override
    public MyServiceD getObject() throws Exception {
        return new MyServiceD();
    }

    @Override
    public Class<?> getObjectType() {
        return MyServiceD.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
