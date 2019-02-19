package decorator.first;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 18:12
 *
 * 装饰器 装饰器抽象类
 */
public class Decorator extends CalcPrize {

    private CalcPrize calcPrize;

    public Decorator(CalcPrize calcPrize) {
        this.calcPrize = calcPrize;
    }

    /**
     * 默认未进行装饰
     * @return
     */
    @Override
    protected double calPrize(String user) {
        return this.calcPrize.calPrize(user);
    }
}
