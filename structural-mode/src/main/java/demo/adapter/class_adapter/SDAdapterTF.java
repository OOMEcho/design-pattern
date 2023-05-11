package demo.adapter.class_adapter;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 19:00
 * @Description: SD适配TF
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return super.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card ");
        super.writeTF(msg);
    }
}
