package demo.mediator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 17:09
 * @Description:
 */
public class MediatorTest {
    public static void main(String[] args) {
        // 创建中介者
        MediatorStructure mediator = new MediatorStructure();
        // 创建房主
        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        // 创建租房者
        Tenant tenant = new Tenant("李四", mediator);
        // 中介者要知道房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contact("我想租三室的房子");
        houseOwner.contact("我这里有三室的房子，你需要租吗？");
    }
}
