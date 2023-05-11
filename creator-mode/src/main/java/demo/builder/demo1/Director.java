package demo.builder.demo1;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 16:19
 * @Description: 指挥者
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
