package demo.builder.demo2;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 16:56
 * @Description: 手机测试类
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星")
                .memory("金士顿")
                .mainBoard("华硕")
                .build();
        System.out.println(phone);
    }
}
