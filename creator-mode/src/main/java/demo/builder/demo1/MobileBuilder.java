package demo.builder.demo1;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 16:17
 * @Description: 具体的建造者
 */
public class MobileBuilder extends Builder {

    @Override
    void buildFrame() {
        super.bike.setFrame("碳纤维车架");
    }

    @Override
    void buildSeat() {
        super.bike.setSeat("真皮车座");
    }

    @Override
    Bike createBike() {
        return super.bike;
    }
}
