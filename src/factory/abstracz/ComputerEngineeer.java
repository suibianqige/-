package factory.abstracz;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/6 17:21
 * 组装电脑人员
 *
 */
public class ComputerEngineeer {

    /**
     * 组装电脑
     */
    public void operate(AbstractFactory factory){
        CPUApi cpu = factory.getCpu();
        BoardApi board = factory.getBorad();
        cpu.showCPUName();
        board.showBoardName();
    }
}
