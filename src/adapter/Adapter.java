package adapter;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/29 17:33
 */
public class Adapter implements Target{

    private Adeptee adeptee = new Adeptee();
    @Override
    public void dosomething() {
        System.out.println("这里就是一个转接器，可是让我们使用外部的功能");
        adeptee.apply();
    }

    @Override
    public void nethod() {
    }
}
