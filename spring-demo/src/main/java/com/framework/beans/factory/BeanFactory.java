package com.framework.beans.factory;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/14 18:56
 * @Description: Bean工厂(IOC)
 */
public interface BeanFactory {

    Object getBean(String beanName) throws Exception;

    <T> T getBean(String beanName, Class<? extends T> beanClass) throws Exception;
}
