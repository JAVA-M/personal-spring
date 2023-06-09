package com.mxf.spring.beans.factory.support;

import com.mxf.spring.beans.factory.config.BeanDefinition;

/**
 * @author manxingfu
 * @date 2023/4/21
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
