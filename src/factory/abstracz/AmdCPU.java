package factory.abstracz;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/6 17:08
 */
public class AmdCPU implements CPUApi {
    @Override
    public void showCPUName() {
        System.out.println("AMD处理器");
    }
}
