package com.mxf.spring;

/**
 * @author manxingfu
 * @date 2023/4/21
 * @desc 简单模拟 Spring 中的 BeanDefinition
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
