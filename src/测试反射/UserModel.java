package 测试反射;

import sun.misc.Contended;

/**
 * @Author: 杨长江
 * @Date: 2019-06-04 09:04
 * @Description: 说明
 */
@Contended
public class UserModel {

    private int a;

    private String b;

    private static int c;

    private final String d;

    private static final String e = "qwer";

    public UserModel(int a, String b) {
        this.a = a;
        this.b = b;
        this.d = "v";
    }

    private void setA(int a) {
        this.a = a;
    }

    private void setB(String b) {
        this.b = b;
    }

    private static void setC(int c) {
        UserModel.c = c;
    }
}
