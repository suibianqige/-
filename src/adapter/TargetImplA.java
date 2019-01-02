package adapter;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/29 18:10
 */
public class TargetImplA implements Target {
    @Override
    public void dosomething() {
        System.out.println("这个是原有的实现");
    }

    @Override
    public void nethod() {
        System.out.println("这个是一个不相干的其他方法");
    }
}
