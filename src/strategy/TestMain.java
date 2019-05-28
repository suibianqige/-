package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 10:06
 * @Description: 策略模式，把某种具体的算法封装成每个单独的算法；客户端选择实例化某个具体的算法，赋给某个持有者统一调用；
 * 隐藏实现细节，减少判断
 */
public class TestMain {

    public static void main(String[] args) {
        PayStrategy payStrategy = new ApliPayStrategy();
        Map<String,Object> map = new HashMap<>();
        map.put("参数","值");
        payStrategy.withParam(map);

        PayContext payContext = new PayContext(payStrategy);
        payContext.pay();
    }
}
