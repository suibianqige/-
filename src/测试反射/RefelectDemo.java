package 测试反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Stream;

/**
 * @Author: 杨长江
 * @Date: 2019-06-04 09:03
 * @Description: 说明
 */
public class RefelectDemo {

    public static void main(String[] args) {
        /*Class clazz = UserModel.class;
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
        }*/
        System.out.println(new String(new byte[]{}));


        //可以设置null值
        /*CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.add(null);*/


        //set可以设置null
        /*CopyOnWriteArraySet set = new CopyOnWriteArraySet();
        set.add(null);
        System.out.println(set.size());*/

        //不可以设置null键也不能设置null值
        /*ConcurrentHashMap map = new ConcurrentHashMap();
        map.put(new Object(),new Object());*/

        //可以设置null键，null值
        /*HashMap map = new HashMap();
        map.put(null,null);*/

        List list = new ArrayList();
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());

        //普通for循环，因为列表长度变化的问题，会有元素被遗漏
        /*for(int i = 0; i<list.size(); i++){
            System.out.println(list.size());
            list.remove(i);
        }*/

        //增强for循环会报错
        /*for (Object o: list){
            list.remove(o);
        }*/

        while (list.iterator().hasNext()){
            list.remove(list.iterator().next());
        }

        Stream<Integer> s = (new ArrayList<Integer>()).stream();
        System.out.println("dsadasdsa---->"+s.reduce((a,b) -> a+b).orElseGet(()->0));

        Class clazz = UserModel.class;

        Constructor[] constructors = clazz.getConstructors();
        System.out.println(constructors.toString());

        //共有属性
        Field[] fields = clazz.getFields();
        for(Field field : fields){
            System.out.println(field);
        }

        //全部属性
        Field[] fields1 = clazz.getDeclaredFields();
        Arrays.asList(fields1).stream().forEach(field -> {
            System.out.println(field);
            System.out.println(field.isAccessible());
        });

        Method[] methods = clazz.getMethods();
        for(Method method:methods){
           // method.invoke()
        }

        System.out.println(testFinal());

        try {
            // do something
            System.exit(1);
        } finally{
            System.out.println("发送到");
        }

    }

    static int testFinal(){
        int i = 0;
        try{
            return ++i;
        }finally {
            return ++i;
        }
    }
}
