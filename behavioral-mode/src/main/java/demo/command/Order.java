package demo.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 21:36
 * @Description:
 */
public class Order {
    // 餐桌号码
    private int diningTable;

    // 用来存储餐名并记录份数
    private final Map<String, Integer> foodDic = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name, int num) {
        foodDic.put(name, num);
    }
}
