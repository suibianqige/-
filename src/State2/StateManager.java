package State2;

/**
 * @Author: 杨长江
 * @Date: 2019-05-28 20:42
 * @Description: 说明
 */
public class StateManager {

    private State state;

    private BusinessModel model;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public BusinessModel getModel() {
        return model;
    }

    public void setModel(BusinessModel model) {
        this.model = model;
    }

    /**
     * 外部调用状态机处理业务逻辑
     */
    void doWork(){
        this.state.doWork(this);
    }
}
