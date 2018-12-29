package factory.abstracz;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/6 17:24
 * 抽象工厂：
 */
public class TestMain {

    public static void main(String[] args){
        //初始化一个组装方案
        AbstractFactory factory = new SchemaIntel();
        //初始化一个工程师
        ComputerEngineeer engineeer = new ComputerEngineeer();
        //工程师开始组装
        engineeer.operate(factory);
    }
}
