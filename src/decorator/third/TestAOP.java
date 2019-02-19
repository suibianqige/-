package decorator.third;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/3 16:11
 *
 * 用装饰者模式模拟一下AOP功能
 */
public class TestAOP {

    public static void main(String[] args){

        Order order = new Order();
        order.setName("李四");
        order.setGoodsName("富士山苹果");
        order.setNum(5);
        new SecurityDecorator(new LoggerDecorator(new OrderApiImpl())).oprate(order);
    }
}
