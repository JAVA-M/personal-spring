package com.mxf.spring.beans.factory;

import com.mxf.spring.beans.BeansException;

/**
 * @author manxingfu
 * @date 2023/4/21
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
