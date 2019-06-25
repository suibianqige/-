package decorator.first;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 18:08
 *
 * 默认实现 返回的奖金为0
 */
public class CalcPrizeDefault extends CalcPrize {

    @Override
    protected double calPrize(String user) {
        System.out.println("默认无提成");
        return 0;
    }
}
