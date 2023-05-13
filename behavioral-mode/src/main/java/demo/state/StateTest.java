package demo.state;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 15:12
 * @Description:
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
