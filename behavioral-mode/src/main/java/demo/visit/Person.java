package demo.visit;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 20:49
 * @Description: 访问者角色
 */
public interface Person {

    // 喂食狗
    void feed(Dog dog);

    // 喂食猫
    void feed(Cat cat);
}
