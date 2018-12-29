package factory.abstracz;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/6 17:13
 * intel处理器，华硕主板组装方案
 */
public class SchemaIntel implements AbstractFactory {
    @Override
    public CPUApi getCpu() {
        return new IntelCPU();
    }

    @Override
    public BoardApi getBorad() {
        return new HuaShuoBoard();
    }
}
