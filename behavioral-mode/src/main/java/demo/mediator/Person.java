package demo.mediator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 17:04
 * @Description: 抽象同事类
 */
public abstract class Person {

    protected String name;

    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
