package com.mxf.spring.test;

import com.mxf.spring.beans.PropertyValue;
import com.mxf.spring.beans.PropertyValues;
import com.mxf.spring.beans.factory.config.BeanDefinition;
import com.mxf.spring.beans.factory.config.BeanReference;
import com.mxf.spring.beans.factory.support.DefaultListableBeanFactory;
import com.mxf.spring.test.bean.UserDao;
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

        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
