package decorator.first;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/3 9:20
 */
public class TempDB {

    public static Map<String,Integer> personalPrize;

    static {
        if(personalPrize == null){
            personalPrize = new HashMap<>();
        }
        personalPrize.put("y",100000);
    }
}
