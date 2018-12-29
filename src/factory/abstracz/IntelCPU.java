package factory.abstracz;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/6 17:06
 */
public class IntelCPU implements CPUApi {
    @Override
    public void showCPUName() {
        System.out.println("intel处理器");
    }
}
