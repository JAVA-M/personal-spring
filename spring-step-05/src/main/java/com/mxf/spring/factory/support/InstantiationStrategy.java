package com.mxf.spring.factory.support;

import com.mxf.spring.beans.BeansException;
import com.mxf.spring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author manxingfu
 * @date 2023/4/23
 * @desc 实例化策略接口
 */
public interface InstantiationStrategy {
    /**
     * 在实例化接口 instantiate 方法中添加必要的入参信息，包括：beanDefinition、 beanName、ctor、args
     * @param beanDefinition
     * @param beanName
     * @param ctor 它是 java.lang.reflect 包下的 Constructor 类，里面包含了一些必要的类信息，有这个参数的目的就是为了拿到符合入参信息相对应的构造函数。
     * @param args 是一个具体的入参信息了，最终实例化时候会用到。
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
