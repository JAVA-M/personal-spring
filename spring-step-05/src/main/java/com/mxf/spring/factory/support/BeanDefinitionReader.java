package com.mxf.spring.factory.support;

import com.mxf.spring.BeansException;
import com.mxf.spring.core.io.Resource;
import com.mxf.spring.core.io.ResourceLoader;

/**
 * @author manxingfu
 * @date 2023/4/27 16:03
 * @desc Bean定义信息读取接口
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
