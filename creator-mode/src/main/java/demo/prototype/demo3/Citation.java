package demo.prototype.demo3;

import java.io.Serializable;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 11:06
 * @Description:
 */
public class Citation implements Cloneable, Serializable {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show() {
        System.out.println(student.getName() + "同学在第2023届毕业设计中表现优秀，被评为三好学生！");
    }

    @Override
    public String toString() {
        return "Citation{" +
                "student=" + student +
                '}';
    }

    @Override
    public Citation clone() {
        try {
            return (Citation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
