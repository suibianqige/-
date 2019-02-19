package decorator.third;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/3 16:13
 */
public class Order {

    /**
     * 用户名称
     */
    private String name;
    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 数量
     */
    private int num;

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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
