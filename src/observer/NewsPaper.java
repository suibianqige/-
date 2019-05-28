package observer;

import java.util.Observable;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 21:02
 * @Description: 说明
 */
public class NewsPaper extends Observable {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 通知更新接口
     * @param msg
     */
    public void update(String msg){
        this.setMsg(msg);
        this.setChanged();
        //这个notifyObservers方法有两个版本，有参和无参
        //主动拉取方式使用无参，被动接受使用有参
       // this.notifyObservers(msg);
        this.notifyObservers();
    }
}
