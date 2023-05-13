package demo.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 22:59
 * @Description: 环境角色类
 */
public class Context {

    private final Map<Variable, Integer> map = new HashMap<>();

    // 添加变量
    public void assign(Variable variable, int value) {
        map.put(variable, value);
    }

    // 根据变量获取值
    public int getValue(Variable variable) {
        return map.get(variable);
    }
}
