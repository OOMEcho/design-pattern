package demo.decorator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 21:46
 * @Description:
 */
public class DecoratorTest {
    public static void main(String[] args) {
        FriedRice friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + "  " + friedRice.cost());

        System.out.println("=========");

        //加鸡蛋
        Egg egg = new Egg(friedRice);
        System.out.println(egg.getDesc() + "  " + egg.cost());

        System.out.println("=========");

        //加培根
        Bacon bacon = new Bacon(egg);
        System.out.println(bacon.getDesc() + "  " + bacon.cost());
    }
}
