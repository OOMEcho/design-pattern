package com.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/14 18:17
 * @Description: 用来存储和管理PropertiesValue对象
 */
public class MutablePropertyValues implements Iterable<PropertyValue> {

    // 用来存储PropertiesValue对象
    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if (propertyValueList == null) {
            this.propertyValueList = new ArrayList<>();
        } else {
            this.propertyValueList = propertyValueList;
        }
    }

    // 获取PropertyValue对象
    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    // 根据name获取PropertyValue对象
    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }
        return null;
    }

    // 判断集合是否为空
    public boolean isEmpty() {
        return this.propertyValueList.isEmpty();
    }

    // 添加PropertyValue对象
    public void addPropertyValue(PropertyValue propertyValue) {
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue currentPv = propertyValueList.get(i);
            if (currentPv.getName().equals(propertyValue.getName())) {
                propertyValueList.set(i, propertyValue);
                return;
            }
        }
        propertyValueList.add(propertyValue);
    }

    // 判断是否包含指定的PropertyValue对象
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }

    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }
}
