package proxy.dynamic;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/3/21 15:07
 */
public class TestMain {

    public static void main(String[] args){
       /* Hello hello = new HelloImpl();
        Handler handler = new Handler(hello);
        Hello helloProxy = (Hello) Proxy.newProxyInstance(TestMain.class.getClassLoader(),hello.getClass().getInterfaces(),handler);
        helloProxy.sayHello("杨长江");*/
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("2");
        list.add("2");
        for (String item : list) {
            if ("1".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list);
    }
}
