package demo.builder.demo1;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 16:14
 * @Description: 抽象建造者
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    abstract void buildFrame();

    abstract void buildSeat();

    abstract Bike createBike();
}
