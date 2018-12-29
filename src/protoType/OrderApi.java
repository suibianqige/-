package protoType;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/25 10:11
 *
 * 订单接口
 */
public interface OrderApi{

    int getNumber();

    void setNumber(int number);

    OrderApi cloneSelf() throws Exception;
}
