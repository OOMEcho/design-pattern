package demo.prototype.demo3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 11:08
 * @Description: 测试类
 */
public class CitationTest {
    public static void main(String[] args) throws Exception {
        // 创建原型对象
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        // 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("D:\\Temp\\Citation.txt")));
        oos.writeObject(citation);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("D:\\Temp\\Citation.txt")));
        Citation readObject = (Citation) ois.readObject();
        ois.close();

        readObject.getStudent().setName("李四");

        citation.show();
        readObject.show();

    }
}
