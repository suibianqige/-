package singleton.hungry;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/7 9:05
 * 单列模式
 * 读取一份配置文件：如果不设置为单列就会多线程情况下存在多份文件加载到内存。
 * 饥饿模式：不管此类有没有被调用都创建一个单列对象：相对的还有懒汉模式
 * 一直到被用到的时候才进行实例化。这种情况需要考虑线程安全问题
 */
public class Singleton {

    /**
     * 恶汉模式
     */
    private static Singleton singleton = new Singleton();

    private String paramA;

    private String paramB;

    /**
     * 私有化构造方法
     */
    private Singleton(){

    }

    /**
     * 获取单列
     * @return 返回单利
     */
    public static Singleton getSigleton(){
        return singleton;
    }

    /**
     * 读取配置文件
     */
    public void readConfig() throws IOException {
        Properties properties = new Properties();
        InputStream is = Singleton.class.getClassLoader().getResourceAsStream("singleton/application.properties");
        properties.load(is);
        this.paramA = properties.getProperty("paramA");
        this.paramB = properties.getProperty("paramB");
    }

    public String getParamA() {
        return paramA;
    }

    public String getParamB() {
        return paramB;
    }
}
