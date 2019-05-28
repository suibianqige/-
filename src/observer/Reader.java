package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 21:02
 * @Description:
 */
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察者模式：arg--->"+arg);
        System.out.println("主动拉取更新信息："+ ((NewsPaper)o).getMsg());
    }
}
