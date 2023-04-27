package com.mxf.spring.factory;

import com.mxf.spring.beans.BeansException;

/**
 * @author manxingfu
 * @date 2023/4/21
 */
public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;

    Object getBean(String beanName, Object... args) throws BeansException;
}
