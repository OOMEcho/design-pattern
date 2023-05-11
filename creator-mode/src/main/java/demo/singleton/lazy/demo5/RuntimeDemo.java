package demo.singleton.lazy.demo5;

import java.io.InputStream;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 18:34
 * @Description: Runtime测试
 */
public class RuntimeDemo {
    public static void main(String[] args) throws Exception {
        // 获取Runtime实例
        Runtime runtime = Runtime.getRuntime();
        // 执行命令
        Process process = runtime.exec("ipconfig");
        // 获取输入流
        InputStream is = process.getInputStream();
        // 创建字节数组
        byte[] array = new byte[1024 * 1024 * 100];
        // 读取命令执行结果
        int len = is.read(array);
        // 输出结果
        System.out.println(new String(array, 0, len, "GBK"));
    }
}
