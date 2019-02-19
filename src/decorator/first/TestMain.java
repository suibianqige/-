package decorator.first;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 17:56
 *
 *
 * 装饰者模式 ：java中的 I/O流是装饰者模式的经典应用
 *
 * 如果需要在不影响其它对象的情况下，以动态、透明的方式给对象添加职责，可以使用装饰模式，这几乎就是装饰模式的主要功能
 *
 * 俄罗斯套娃
 */
public class TestMain {

    public static void main(String[] args){
        CalcPrize calcPrize = new CalcPrizeDefault();
        System.out.println("当月总奖金为："+new SumPriceDecorator(new MonthPrizeDecorator(calcPrize)).calPrize("y"));

    }

}
