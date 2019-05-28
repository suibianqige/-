package State2;

import java.util.Scanner;

/**
 * @Author: 杨长江
 * @Date: 2019-05-28 20:46
 * @Description: 部门经理处理
 */
public class DmState implements State {

    @Override
    public void doWork(StateManager manager) {

        BusinessModel model = manager.getModel();

        System.out.println("项目经理审批结束，部门经理开始审批");
        System.out.println("1同意0拒绝");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            if(a == 0){
               model.setResult("拒绝");
            }
            if(a==1){
                model.setResult("同意");
            }
            manager.setModel(model);
            manager.setState(new OverState());
            manager.doWork();
        }
    }
}
