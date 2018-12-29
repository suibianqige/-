package factory.abstracz;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/6 17:16
 * amd处理器，微星主板组装方案
 */
public class SchemeAmd implements AbstractFactory {
    @Override
    public CPUApi getCpu() {
        return new AmdCPU();
    }

    @Override
    public BoardApi getBorad() {
        return new WeiXinBoard();
    }
}
