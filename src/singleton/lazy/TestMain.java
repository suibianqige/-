package singleton.lazy;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/7 9:17
 * 单列模式：测试类  证明多线程下调用的都是同一个singleton对象
 *
 */
public class TestMain {

    public static void main(String[] args){

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 0;i <10 ;i++){
            executorService.execute(() -> {
                Singleton single = Singleton.getSigleton();
                try {
                    single.readConfig();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(single.toString());
            });
        }
    }
}
