package decorator.third;

import java.util.Objects;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/2/18 18:07
 */
public class SecurityDecorator extends Decorator {

    public SecurityDecorator(OrderApi orderApi){
        super(orderApi);
    }
    @Override
    public String oprate(Order order) {
        if(!Objects.equals("张三",order.getName())){
            System.out.println("无权限访问");
            return null;
        }
        return super.decorator.oprate(order);
    }
}
