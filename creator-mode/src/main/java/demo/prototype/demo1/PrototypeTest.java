package demo.prototype.demo1;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 11:00
 * @Description: 原型模式测试类
 */
public class PrototypeTest {
    public static void main(String[] args) {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = realizeType.clone();
        System.out.println("realizeType == clone ? " + (realizeType == clone));
    }
}
