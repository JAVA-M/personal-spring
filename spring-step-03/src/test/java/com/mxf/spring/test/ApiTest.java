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

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "满兴富", 21);
        userService.queryUserInfo();
    }

}
