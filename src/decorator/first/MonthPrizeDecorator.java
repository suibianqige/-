package decorator.first;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 18:13
 *
 * 月业绩奖金提成
 */
public class MonthPrizeDecorator extends Decorator{

    public MonthPrizeDecorator(CalcPrize calcPrize) {
        super(calcPrize);
    }

    /**
     * 计算月业绩奖金提成
     * @return
     */
    @Override
    protected double calPrize(String user) {
        System.out.println("当月的业绩奖金："+TempDB.personalPrize.get(user)*0.3);
        return  super.calPrize(user)+TempDB.personalPrize.get(user)*0.3;
    }
}
