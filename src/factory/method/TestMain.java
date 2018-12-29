package factory.method;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/3 11:33
 * 测试工厂方法
 * 核心思想：工厂方法的主要功能是让父类在不知道具体实现的情况下，完成自身的功能调用，而具体的实现延迟到子类来实现。
 */
public class TestMain {

    private int a = 0;
    public static void main(String[] args) {

        ExportOprate oprate = new ExportTextOprate();
        oprate.export();
    }
}
