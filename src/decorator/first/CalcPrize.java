package decorator.first;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 18:05
 */
public abstract class CalcPrize {

    /**
     * 业绩，默认都是10000
     */
    protected int base = 10000;
    /**
     * 计算奖金
     */
    protected abstract double calPrize(String user);
}
