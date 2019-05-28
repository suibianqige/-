package strategy;

import java.util.Map;
/**
 * @Author: 杨长江
 * @Date: 2019-05-27 09:57
 * @Description: 说明
 */
public interface PayStrategy {

    /**
     * 支付接口
     */
    void pay();

    /**
     * 参数
     * @param param
     */
    void withParam(Map<String,Object> param);
}
