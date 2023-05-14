package com.framework.beans.factory.xml;

import com.framework.beans.BeanDefinition;
import com.framework.beans.MutablePropertyValues;
import com.framework.beans.PropertyValue;
import com.framework.beans.factory.support.BeanDefinitionReader;
import com.framework.beans.factory.support.BeanDefinitionRegistry;
import com.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/14 18:33
 * @Description: 用来解析配置文件
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    // 注册表对象
    private final BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(configLocation);
        SAXReader reader = new SAXReader();
        Document document = reader.read(is);
        Element rootElement = document.getRootElement();
        //解析bean标签
        parseBean(rootElement);
    }

    private void parseBean(Element rootElement) {
        List<Element> elements = rootElement.elements("bean");
        for (Element element : elements) {
            String id = element.attributeValue("id");
            String className = element.attributeValue("class");
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);
            List<Element> list = element.elements("property");
            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
            for (Element element1 : list) {
                String name = element1.attributeValue("name");
                String ref = element1.attributeValue("ref");
                String value = element1.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                mutablePropertyValues.addPropertyValue(propertyValue);
            }
            beanDefinition.setPropertyValues(mutablePropertyValues);
            registry.registerBeanDefinition(id, beanDefinition);
        }
    }
}
