package demo.visit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 20:52
 * @Description: 结构对象角色
 */
public class Home {

    private final List<Animal> animals = new ArrayList<>();

    public void action(Person person) {
        animals.forEach(animal -> animal.accept(person));
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
