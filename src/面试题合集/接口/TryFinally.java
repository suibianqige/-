package 面试题合集.接口;

/**
 * @Author: 杨长江
 * @Date: 2019-06-24 22:54
 * @Description: 说明
 */
public class TryFinally {

    public static void main(String[] args) {

        System.out.println(ss());
    }

    public static int ss(){
        try{
            throw new Exception();
           // return 1;
        }catch (Exception e){
            return 3;
        }finally {
            return 2;
        }
    }
}
