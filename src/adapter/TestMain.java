package adapter;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/29 17:02
 *
 * 适配器模式 ： 啥时适配器模式，适配器模式☞将一个已存在的且可以达到目的但是却不兼容的功能复用起来。
 * 个人理解适配器没啥卵用：说白了就是子类有自己的独特的实现方式，可能需要借助一点外力而已
 */
public class TestMain {

    public static void main(String[] args){
        Target target = new Adapter();
        target.dosomething();
    }
}
