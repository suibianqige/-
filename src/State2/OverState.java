package State2;

import java.util.Scanner;

/**
 * @Author: 杨长江
 * @Date: 2019-05-28 20:47
 * @Description: 最终态，显示结果
 */
public class OverState implements State {
    @Override
    public void doWork(StateManager manager) {

        BusinessModel model = manager.getModel();
        System.out.println(model.getName()+"你的请假审批最终结果为："+model.getResult());

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入1终止程序");

        while(scanner.hasNext()){
            if(scanner.nextInt() == 1){
                System.exit(0);
            }
        }
    }
}
