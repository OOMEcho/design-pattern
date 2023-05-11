package demo.adapter.object_adapter;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 18:59
 * @Description: 测试类
 */
public class AdapterTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("=============");

        String msg2 = computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(msg2);
    }
}
