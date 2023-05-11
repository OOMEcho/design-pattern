package demo.adapter.class_adapter;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 18:48
 * @Description: 适配者类接口
 */
public interface TFCard {

    String readTF();

    void writeTF(String msg);
}
