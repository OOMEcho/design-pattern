package demo.bridge;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 22:23
 * @Description: 桥接模式测试类
 */
public class BridgeTest {
    public static void main(String[] args) {
        VideoFile rmvbFile = new RmvbFile();
        OperatingSystem windows = new Windows(rmvbFile);
        windows.play("战狼2");

        VideoFile aviFile = new AviFile();
        OperatingSystem linux = new Mac(aviFile);
        linux.play("战狼2");
    }
}
