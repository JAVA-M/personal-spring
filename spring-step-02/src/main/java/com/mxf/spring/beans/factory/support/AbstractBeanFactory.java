package com.mxf.spring.beans.factory.support;

import com.mxf.spring.beans.BeansException;
import com.mxf.spring.beans.factory.BeanFactory;
import com.mxf.spring.beans.factory.config.BeanDefinition;

/**
 * @author manxingfu
 * @date 2023/4/21
 * @desc 该类的设计使用了 模版模式 的设计模式
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
