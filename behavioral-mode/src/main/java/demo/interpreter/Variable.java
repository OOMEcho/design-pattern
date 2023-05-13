package demo.interpreter;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 22:59
 * @Description: 变量类
 */
public class Variable extends AbstractExpression {

    // 变量名称
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpreter(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
