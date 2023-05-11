package demo.adapter.object_adapter;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 19:00
 * @Description: SD适配TF
 */
public class SDAdapterTF implements SDCard {

    private final TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card ");
        tfCard.writeTF(msg);
    }
}
