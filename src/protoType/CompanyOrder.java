package protoType;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/25 10:12
 *
 * 公司订单
 */
public class CompanyOrder implements OrderApi,Cloneable{

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 数量
     */
    private int number;

    /**
     * 这个应该是浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
        return (OrderApi) super.clone();
    }

    @Override
    public String toString() {
        return "CompanyOrder{" +
                "companyName='" + companyName + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", number=" + number +
                '}';
    }
}
