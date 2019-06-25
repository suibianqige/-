package 面试题合集.类继承;

import 面试题合集.接口.InertfaceA;

/**
 * @Author: 杨长江
 * @Date: 2019-06-24 23:03
 * @Description: 说明
 */
public class TestImplA extends TestImpl {

    @Override
    public void a() throws UnsupportedOperationException {
        super.a();
    }

    @Override
    public int b() {
        return 0;
    }

    /*@Override
    public void b(){

    }

    public int b(){}*/
}
