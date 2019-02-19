package decorator.third;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/2/18 17:56
 */
public class LoggerDecorator extends Decorator {

    public LoggerDecorator(OrderApi decorator){
        super(decorator);
    }

    @Override
    public String oprate(Order order) {
        System.out.println("日志记录："+order.getName()+"购买了"+order.getNum()+"件"+order.getGoodsName());
        return super.decorator.oprate(order);
    }
}
