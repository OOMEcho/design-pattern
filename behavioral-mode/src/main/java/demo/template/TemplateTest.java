package demo.template;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 18:57
 * @Description: 模板方法测试类
 */
public class TemplateTest {
    public static void main(String[] args) {
        //炒手撕包菜
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();

        System.out.println("*******************");

        //炒蒜蓉菜心
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}
