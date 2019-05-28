package State2;

/**
 * @Author: 杨长江
 * @Date: 2019-05-28 20:40
 * @Description: 状态模式
 */
public class TestMain {

    public static void main(String[] args) {

        StateManager manager = new StateManager();

        manager.setState(new PmState());

        manager.setModel(new BusinessModel("小杨","2019-05-28",4));

        manager.doWork();

    }
}
