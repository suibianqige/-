package protoType;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/25 10:10
 *
 * 原型设计模式 ：其实就是clone
 *
 * 需求：每个订单的num不超过1000，超过就拆单
 */
public class TestMain {

    public static void main(String[] args) throws Exception{
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setGoodsName("大饼");
        personalOrder.setName("me");
        personalOrder.setNumber(6490);

        List<OrderApi> orderApis = new ArrayList<>();
        OrderApi orderApi = personalOrder;
        while(orderApi.getNumber() > 1000){
            OrderApi orderApi1 = orderApi.cloneSelf();
            orderApi1.setNumber(1000);
            orderApi.setNumber(orderApi.getNumber()-1000);
            orderApis.add(orderApi1);
        }
        orderApis.add(orderApi);
        System.out.println(orderApis.toString());
    }
}
