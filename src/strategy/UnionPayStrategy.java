package strategy;

import java.util.Map;
/**
 * @Author: 杨长江
 * @Date: 2019-05-27 10:00
 * @Description: 说明
 */
public class UnionPayStrategy implements PayStrategy {

    private Map map;
    @Override
    public void pay() {
        System.out.println("取得param参数，调用银联SDK完成支付"+map);
    }

    @Override
    public void withParam(Map<String, Object> param) {
        this.map = param;
    }
}
