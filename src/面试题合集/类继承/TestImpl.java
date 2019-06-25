package 面试题合集.类继承;

import 面试题合集.接口.InertfaceA;
import 面试题合集.接口.InterfaceB;

import java.io.IOException;


/**
 * @Author: 杨长江
 * @Date: 2019-06-24 22:57
 * @Description: 说明
 *
 * 实现类可以抛出接口定义的异常也可以不抛出
 */
public abstract class TestImpl implements InterfaceB {
    @Override
    public void a() throws UnsupportedOperationException {
        System.out.println(123);
    }

    public static void main(String[] args) {
      //  new TestImpl().a();
    }

    public abstract int b();
}
