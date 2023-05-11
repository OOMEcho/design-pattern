package demo.prototype.demo2;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 11:06
 * @Description:
 */
public class Citation implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "同学：在2023学年第一学期中表现优秀，被评为三好学生。");
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
