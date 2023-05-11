package demo.adapter.object_adapter;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 18:55
 * @Description: 适配者类接口实现类
 */
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        return "TFCard read msg : hello word TFCard";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}
