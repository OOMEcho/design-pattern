package demo.adapter.class_adapter;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 18:57
 * @Description: 目标接口实现类
 */
public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        return "SDCard read msg : hello word SDCard";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
