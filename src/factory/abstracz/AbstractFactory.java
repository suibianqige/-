package factory.abstracz;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/6 17:11
 * 抽象工厂
 */
public interface AbstractFactory {

    /**
     * 获取CPU
     * @return
     */
    CPUApi getCpu();

    /**
     * 获取主板
     * @return
     */
    BoardApi getBorad();

}
