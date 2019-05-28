package State2;

import java.util.Scanner;

/**
 * @Author: 杨长江
 * @Date: 2019-05-28 20:45
 * @Description: 项目经理审批状态
 */
public class PmState implements State {
    @Override
    public void doWork(StateManager manager) {

        BusinessModel model = manager.getModel();
        System.out.println(model.getName()+"从"+model.getBeginDate()+"开始，请"+model.getDays()+"天假：PM开始审批");
        System.out.println("输入1同意，0拒绝");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a = scanner.nextInt();

            if(a == 0){
                model.setResult("拒绝");
                manager.setModel(model);
                manager.setState(new OverState());
                manager.doWork();
            }

            if(a == 1){
                if(model.getDays() <= 3){
                    model.setResult("同意");
                    manager.setModel(model);
                    manager.setState(new OverState());
                    manager.doWork();
                }else {
                    model.setResult("DM审核中");
                    manager.setModel(model);
                    manager.setState(new DmState());
                    manager.doWork();
                }
            }
        }
    }
}
