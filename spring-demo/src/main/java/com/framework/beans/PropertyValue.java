package com.framework.beans;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/14 18:14
 * @Description: 用来封装bean标签的property标签属性
 */
public class PropertyValue {

    // property标签的name属性
    private String name;

    // property标签的value属性
    private String value;

    // property标签的ref属性
    private String ref;

    public PropertyValue() {
    }

    public PropertyValue(String name, String value, String ref) {
        this.name = name;
        this.value = value;
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
