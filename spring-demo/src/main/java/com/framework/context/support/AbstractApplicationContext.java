package com.framework.context.support;

import com.framework.beans.factory.support.BeanDefinitionReader;
import com.framework.beans.factory.support.BeanDefinitionRegistry;
import com.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/14 19:19
 * @Description: 应用上下文的子实现类
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    // 声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;

    // 定义用于存储bean对象的map容器
    protected Map<String, Object> singletonObjects = new HashMap<>();

    // 声明配置文件路径的变量
    protected String configLocations;

    @Override
    public void refresh() throws Exception {
        // 加载BeanDefinition对象
        beanDefinitionReader.loadBeanDefinitions(configLocations);
        finishBeanInitialization();
    }

    //bean的初始化
    private void finishBeanInitialization() throws Exception {
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        String[] beanNames = registry.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            getBean(beanName);
        }
    }
}
