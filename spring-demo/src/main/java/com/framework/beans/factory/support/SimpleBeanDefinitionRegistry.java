package com.framework.beans.factory.support;

import com.framework.beans.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/14 18:29
 * @Description: 注册表实现类
 */
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry {

    // 定义一个容器，用来存储BeanDefinition对象
    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        // 将BeanDefinition对象存储到容器中
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws Exception {
        beanDefinitionMap.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws Exception {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return beanDefinitionMap.size();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }
}
