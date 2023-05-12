package demo.flyweight;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 17:11
 * @Description:
 */
public class FlyweightTest {
    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox box1 = boxFactory.getBox("I");
        box1.display("灰色");
        AbstractBox box2 = boxFactory.getBox("L");
        box2.display("绿色");
        AbstractBox box3 = boxFactory.getBox("O");
        box3.display("黄色");

        AbstractBox box4 = boxFactory.getBox("O");
        box4.display("红色");

        System.out.println(box3 == box4);
    }
}
