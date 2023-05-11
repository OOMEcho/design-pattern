package demo.adapter.class_adapter;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 18:58
 * @Description: 计算机类
 */
public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
