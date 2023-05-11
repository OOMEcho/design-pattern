package demo.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 9:55
 * @Description: 咖啡工厂类
 */
public class CoffeeFactory {

    private static final Map<String, Coffee> map = new HashMap<>();

    static {
        Properties properties = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("factory/config_factory/coffee.properties");
        try {
            properties.load(is);
            //遍历Properties集合对象
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                //根据键获取值（全类名）
                String className = properties.getProperty((String) key);
                //获取字节码对象
                Class<?> clazz = Class.forName(className);
                Coffee obj = (Coffee) clazz.newInstance();
                map.put((String) key, obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
