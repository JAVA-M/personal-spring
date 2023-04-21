package com.mxf.spring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author manxingfu
 * @date 2023/4/21
 * @desc 简单模拟 Spring 中的 BeanFactory
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

    public <T> T getBean(String beanName, Class<T> requiredType) {
        return (T) beanDefinitionMap.get(beanName).getBean();
    }

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
