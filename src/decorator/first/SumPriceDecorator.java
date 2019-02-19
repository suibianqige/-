package decorator.first;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 18:53
 */
public class SumPriceDecorator extends Decorator {

    public SumPriceDecorator(CalcPrize calcPrize) {
        super(calcPrize);
    }

    @Override
    protected double calPrize(String user) {
        System.out.println("当月累计奖金"+0.1*super.base);
        return super.calPrize(user) + 0.1*super.base;
    }
}
