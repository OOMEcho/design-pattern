package demo.flyweight;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 17:08
 * @Description: 抽象享元角色
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
