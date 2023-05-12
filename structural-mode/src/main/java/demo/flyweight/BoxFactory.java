package demo.flyweight;

import java.util.HashMap;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 17:10
 * @Description:
 */
public class BoxFactory {
    private static HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<>();
        AbstractBox iBox = new IBox();
        AbstractBox lBox = new LBox();
        AbstractBox oBox = new OBox();
        map.put("I", iBox);
        map.put("L", lBox);
        map.put("O", oBox);
    }

    public static BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public AbstractBox getBox(String key) {
        return map.get(key);
    }
}
