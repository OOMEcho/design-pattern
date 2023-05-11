package demo.builder.demo1;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 16:21
 * @Description: 建造者测试类
 */
public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director(new OfoBuilder());
        Bike construct = director.construct();
        System.out.println(construct.getFrame());
        System.out.println(construct.getSeat());
    }
}
