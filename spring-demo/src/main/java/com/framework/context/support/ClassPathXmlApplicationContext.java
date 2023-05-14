package com.framework.context.support;

import com.framework.beans.BeanDefinition;
import com.framework.beans.MutablePropertyValues;
import com.framework.beans.PropertyValue;
import com.framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.framework.utls.StringUtils;

import java.lang.reflect.Method;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/14 19:28
 * @Description: IOC容器实现类
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocations = configLocation;
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanName) throws Exception {
        Object o = singletonObjects.get(beanName);
        if (o != null) {
            return o;
        }
        // 从注册表中获取bean对象
        BeanDefinition beanDefinition = beanDefinitionReader.getRegistry().getBeanDefinition(beanName);
        String className = beanDefinition.getClassName();
        Class<?> clazz = Class.forName(className);
        // 通过反射创建对象
        Object bean = clazz.newInstance();
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            String name = propertyValue.getName();
            String value = propertyValue.getValue();
            String ref = propertyValue.getRef();
            if (ref != null && ! "".equals(ref)) {
                Object bean1 = getBean(ref);
                String methodName = StringUtils.getSetterMethodName(name);
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (methodName.equals(method.getName())) {
                        method.invoke(bean, bean1);
                    }
                }
            }
            if (value != null && ! "".equals(value)) {
                String methodName = StringUtils.getSetterMethodName(name);
                clazz.getMethod(methodName, String.class).invoke(bean, value);
            }
        }
        singletonObjects.put(beanName, bean);
        return bean;
    }

    @Override
    public <T> T getBean(String beanName, Class<? extends T> beanClass) throws Exception {
        Object bean = getBean(beanName);
        if (bean != null) {
            return beanClass.cast(bean);
        }
        return null;
    }
}
