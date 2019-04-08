package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/3/21 15:01
 */
public class Handler implements InvocationHandler {

    private Object target;

    public Handler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StringBuffer sb = new StringBuffer();
        Arrays.stream(args).forEach(o ->  sb.append(o.toString()+";"));
        System.out.println("动态代理:"+method.toString()+" 参数："+sb);
        Object res = method.invoke(target,args);
        return res;
    }
}
