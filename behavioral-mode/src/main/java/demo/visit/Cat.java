package demo.visit;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 20:50
 * @Description: 具体元素角色
 */
public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，喵喵喵");
    }
}
