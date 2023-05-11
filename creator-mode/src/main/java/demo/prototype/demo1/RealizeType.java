package demo.prototype.demo1;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 10:58
 * @Description: 具体原型类
 */
public class RealizeType implements Cloneable {

    public RealizeType() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    public RealizeType clone() {
        try {
            System.out.println("具体原型复制成功！");
            return (RealizeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
