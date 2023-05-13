package demo.visit;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 20:58
 * @Description:
 */
public class VisitTest {
    public static void main(String[] args) {
        Home home = new Home();
        home.addAnimal(new Dog());
        home.addAnimal(new Cat());

        Owner owner = new Owner();
        home.action(owner);

        System.out.println("--------------");

        Someone someone = new Someone();
        home.action(someone);
    }
}
