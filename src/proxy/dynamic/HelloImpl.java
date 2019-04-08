package proxy.dynamic;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/3/21 15:01
 */
public class HelloImpl implements Hello {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello:"+name);
    }
}
