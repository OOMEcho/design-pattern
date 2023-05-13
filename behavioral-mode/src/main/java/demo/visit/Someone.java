package demo.visit;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 20:52
 * @Description: 具体访问者角色
 */
public class Someone implements Person {

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }
}
