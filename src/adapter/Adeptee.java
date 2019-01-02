package adapter;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/29 17:33
 * 这里也可以定义成接口，方便起见直接就是类了
 */
public class Adeptee {

    public void apply(){
        System.out.println("这是外部的一个功能实现，但是不能被原有功能直接使用");
    }
}
