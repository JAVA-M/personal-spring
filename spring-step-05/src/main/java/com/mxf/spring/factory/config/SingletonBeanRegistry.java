package com.mxf.spring.factory.config;

/**
 * @author manxingfu
 * @date 2023/4/21
 * @desc 单例注册接口
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
