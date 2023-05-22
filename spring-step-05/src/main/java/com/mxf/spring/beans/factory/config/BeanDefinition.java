package com.mxf.spring.beans.factory.config;

import com.mxf.spring.beans.PropertyValues;

/**
 * @author manxingfu
 * @date 2023/4/21
 */
public class BeanDefinition {
    private Class beanClass;

    private PropertyValues propertyValues; // 创建对象时填充的属性信息

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
