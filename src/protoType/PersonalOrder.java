package protoType;

import java.util.UnknownFormatFlagsException;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/25 10:12
 *
 * 个人订单
 */
public class PersonalOrder implements OrderApi,Cloneable{

    private String name;

    private String goodsName;

    private int number;

    /**
     * 浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public OrderApi cloneSelf() throws Exception {
        return (OrderApi) this.clone();
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "name='" + name + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", number=" + number +
                '}';
    }
}
