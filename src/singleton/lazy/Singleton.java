package singleton.lazy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/7 9:05
 * 单列模式
 * 读取一份配置文件：如果不设置为单列就会多线程情况下存在多份文件加载到内存。
 * 饥饿模式：不管此方法有没有被调用都创建一个单列对象：相对的还有懒汉模式（初始化的时候酒鬼生成对象）
 * 一直到被用到的时候才进行实例化。这种情况需要考虑线程安全问题
 *
 * 由于lazy模式会产生额外的同步操作，可能降低效率，也更荣易出错。这里可以同过内部类的方式来实现延迟实例化，
 * 而不用添加额外的同步操作
 *
 *类被使用的才会进行实例化。包括以下场景：
 * 1.遇到new，getstatic,putstatic,或invokestatic这4条字节码指令时
 * 2.使用java.lang.reflect包的方法对类进行反射调用的时候，如果类没有进行过初始化，则需要先出法其初始化。
 * 3.当初始化一个类的时候，如果发现其父类还没有进行初始化，则需要先出法其父类的初始化。
 * 4.当虚拟机启动时，用户需要指定一个要执行的主类（包含main（）方法的那个类），虚拟机会先初始化这个主类。
 */
public class Singleton {

    /**
     * lazy模式
     */
    private String paramA;

    private String paramB;

    /**
     * 私有化构造方法
     */
    private Singleton(){}

    private static class CreateSingle{
        static Singleton singleton = new Singleton();
    }

    /**
     * 获取单列
     * @return 返回单利
     */
    public static Singleton getSigleton(){
        return CreateSingle.singleton;
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
