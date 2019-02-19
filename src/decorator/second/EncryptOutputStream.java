package decorator.second;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/3 13:55
 *
 * 加密IO字节流  (输出流)
 */
public class EncryptOutputStream extends FilterOutputStream {

    public EncryptOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    public void write(int b) throws IOException {
        if(b >= 97 && b <= 97+26){
            b += 2;
        }
        super.out.write(b);
    }
}
