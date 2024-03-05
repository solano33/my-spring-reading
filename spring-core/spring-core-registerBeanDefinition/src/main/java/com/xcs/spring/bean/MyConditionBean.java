package com.xcs.spring.bean;

import com.xcs.spring.condition.MyCondition;
import org.springframework.context.annotation.Conditional;

/**
 * @author wuhongbin@xiaomi.com
 * @date 2024/3/1 15:46
 */
@Conditional(MyCondition.class)
public class MyConditionBean {
}
