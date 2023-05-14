package com.framework.beans.factory.support;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/14 18:33
 * @Description: 用来解析配置文件
 */
public interface BeanDefinitionReader {

    //获取注册表对象
    BeanDefinitionRegistry getRegistry();

    //加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
