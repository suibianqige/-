package State2;

/**
 * @Author: 杨长江
 * @Date: 2019-05-28 20:40
 * @Description: 定义状态的接口，里面只有一个该状态对应的处理逻辑,持有一个状态机
 */
public interface State {

    void doWork(StateManager manager);
}
