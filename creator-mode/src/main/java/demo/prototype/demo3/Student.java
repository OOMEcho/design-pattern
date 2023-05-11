package demo.prototype.demo3;

import java.io.Serializable;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 11:11
 * @Description: 学生类
 */
public class Student implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
