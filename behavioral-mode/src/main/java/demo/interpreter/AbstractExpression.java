package demo.interpreter;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 22:58
 * @Description: 抽象表达式类
 */
public abstract class AbstractExpression {

    public abstract int interpreter(Context context);
}
