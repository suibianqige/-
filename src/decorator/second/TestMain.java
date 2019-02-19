package decorator.second;

import java.io.*;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/3 15:46
 */
public class TestMain {
    public static void main(String[] args)throws FileNotFoundException ,IOException{
        File file = new File("a.txt");
        FileOutputStream fs = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(new EncryptOutputStream(new BufferedOutputStream(fs)));
        dos.write("abcd".getBytes());
        dos.flush();
        dos.close();
    }
}
