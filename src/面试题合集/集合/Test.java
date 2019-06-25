package 面试题合集.集合;

import java.util.*;

/**
 * @Author: 杨长江
 * @Date: 2019-06-24 22:26
 * @Description: 说明
 */
public class Test {

    public static void print(Collection collection){
        System.out.println("collection");
    }

    public static void print(List list){
        System.out.println("list");
    }

    public static void print(ArrayList arrayList){
        System.out.println("arrayList");
    }

    public static void print(Set set){
        System.out.println("set");
    }

    public static void print(HashSet hashSet){
        System.out.println("HashSet");
    }

    public static void main(String[] args) {
        Set set = new HashSet();

        List list = new ArrayList();

        print(set);
        print(list);
    }
}
