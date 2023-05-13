package demo.interpreter;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 23:05
 * @Description:
 */
public class InterpreterTest {
    public static void main(String[] args) {
        Context context = new Context();

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        AbstractExpression expression = new Plus(new Minus(a, b), new Plus(c, d));

        System.out.println(expression + " = " + expression.interpreter(context));
    }
}
