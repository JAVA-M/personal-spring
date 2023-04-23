package com.mxf.spring.beans.factory.config;

/**
 * @author manxingfu
 * @date 2023/4/23
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
