package decorator.third;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/2/19 9:01
 */
public class OrderApiImpl implements OrderApi {
    @Override
    public String oprate(Order order) {
        return "下订单";
    }
}
