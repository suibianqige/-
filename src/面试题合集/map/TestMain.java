package 面试题合集.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 杨长江
 * @Date: 2019-06-24 22:38
 * @Description: 说明
 */
public class TestMain {

    public static void main(String[] args) {

        Charactor xd = new Charactor("xiongda","dada");

        Charactor htl = new Charactor("huitailang","i am back");

        Map<Charactor,Integer> map = new HashMap<>(2);

        map.put(xd,1);
        map.put(htl,2);

        System.out.println(map.get(xd));
        System.out.println(map.get(new Charactor("huitailang","i am back")));
    }
}
