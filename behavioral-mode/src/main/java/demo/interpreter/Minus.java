package demo.interpreter;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 23:02
 * @Description: 减法运算类
 */
public class Minus extends AbstractExpression {

    private final AbstractExpression left;
    private final AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        return left.interpreter(context) - right.interpreter(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

}
