package observer;


/**
 * @Author: 杨长江
 * @Date: 2019-05-27 21:01
 * @Description: 观察者模式:观察者注册到被观察者上。被观察者发生变化时会通知观察者
 */
public class TestMain {

    public static void main(String[] args) {

        Reader reader = new Reader("张三");
        Reader reader1 = new Reader("李四");

        NewsPaper newsPaper = new NewsPaper();

        newsPaper.addObserver(reader);
        newsPaper.addObserver(reader1);

        newsPaper.update("更新包纸");
    }
}
