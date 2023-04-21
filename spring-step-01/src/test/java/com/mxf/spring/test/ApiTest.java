package com.mxf.spring.test;

import com.mxf.spring.BeanDefinition;
import com.mxf.spring.BeanFactory;
import com.mxf.spring.test.bean.UserService;
import org.junit.Test;

/**
 * @author manxingfu
 * @date 2023/4/21
 */
public class ApiTest {
    @Test
    public void testBeanFactory() {
        // 1、初始化容器
        BeanFactory beanFactory = new BeanFactory();
        // 2、注册 bean
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(new UserService()));
        // 3、获取 bean
        /*UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();*/
        UserService userService = beanFactory.getBean("userService", UserService.class);
        userService.queryUserInfo();
    }
}
