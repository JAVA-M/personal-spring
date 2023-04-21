package com.mxf.spring.test;

import com.mxf.spring.beans.factory.config.BeanDefinition;
import com.mxf.spring.beans.factory.support.DefaultListableBeanFactory;
import com.mxf.spring.test.bean.UserService;
import org.junit.Test;

/**
 * @author manxingfu
 * @date 2023/4/21
 */
public class ApiTest {
    @Test
    public void testBeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
        System.out.printf("两次获取的对象是否相同: %b", userService == userService_singleton);
    }

}
