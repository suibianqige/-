package strategy;

import java.util.Map;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 09:59
 * @Description: 说明
 */
public class WxPayStrategy implements PayStrategy {
    private Map map;
    @Override
    public void pay() {
        System.out.println("调用微信SDK支付"+map);
    }

    @Override
    public void withParam(Map<String, Object> param) {
        this.map = param;
    }
}
