package demo.singleton.lazy.problem;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 16:20
 * @Description: 序列化反序列化测试
 */
public class SerializableTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeObjectFile();
        Singleton singleton1 = readObjectFile();
        Singleton singleton2 = readObjectFile();
        System.out.println("singleton1 == singleton2：" + (singleton1 == singleton2));
    }

    public static Singleton readObjectFile() throws IOException, ClassNotFoundException {
        // 从文件中读取数据
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("D:\\Temp\\singleton.txt")));
        Singleton instance = (Singleton) ois.readObject();
        ois.close();
        return instance;
    }

    // 向文件中写数据
    public static void writeObjectFile() throws IOException {
        // 获取实例
        Singleton instance = Singleton.getInstance();
        // 将实例对象写入文件
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("D:\\Temp\\singleton.txt")));
        // 写入对象
        oos.writeObject(instance);
        // 关闭流
        oos.close();
    }
}
