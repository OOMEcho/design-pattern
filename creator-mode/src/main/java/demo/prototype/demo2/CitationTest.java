package demo.prototype.demo2;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 11:08
 * @Description: 测试类
 */
public class CitationTest {
    public static void main(String[] args) {
        // 创建原型对象
        Citation citation = new Citation();
        citation.setName("张三");
        citation.show();
        // 克隆原型对象
        Citation clone = citation.clone();
        clone.setName("李四");
        clone.show();
    }
}
