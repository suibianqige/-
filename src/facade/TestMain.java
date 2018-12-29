package facade;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/29 11:17
 *
 * 外观者模式 ： 实现摸一个功能可能会涉及很多的模块，例如A，B,C模块。
 * 如果直接让客户端调用的话很不友好。
 * 用一个类似于门面的东西供客户端使用，客户端只需要调用这一个方法就可以实现这个功能
 * 而不是自己分别调用三个模块。
 *
 * 外观者模式可以很好地和抽象工厂相结合
 */
public class TestMain {

    public static void main(String[] args){
        Facade facade = new Facade(new AbsFactoryImpl());
        facade.test();
    }
}
