package strategy;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 10:00
 * @Description: 策略模式，持有策略接口，客户端注入具体是实现
 */
public class PayContext {

    private PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay(){
        payStrategy.pay();
    }
}
