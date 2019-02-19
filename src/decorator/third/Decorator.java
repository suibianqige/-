package decorator.third;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/2/18 17:53
 */
public abstract class Decorator implements OrderApi {

    protected OrderApi decorator;

    public Decorator(OrderApi decorator){
        this.decorator = decorator;
    }

}
