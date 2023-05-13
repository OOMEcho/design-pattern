package demo.mediator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 17:07
 * @Description: 具体中介者角色类
 */
public class MediatorStructure extends Mediator {

    //首先中介结构必须知道所有房主和租房者的信息
    private HouseOwner houseOwner;
    private Tenant tenant;

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }
}
