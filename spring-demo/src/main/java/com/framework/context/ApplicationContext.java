package com.framework.context;

import com.framework.beans.factory.BeanFactory;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/14 18:58
 * @Description: 应用上下文抽象类
 */
public interface ApplicationContext extends BeanFactory {

    void refresh() throws Exception;
}
