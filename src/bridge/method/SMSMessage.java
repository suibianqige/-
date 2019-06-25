package bridge.method;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 10:23
 *
 * 短信消息
 */
public class SMSMessage implements MessageImplor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("手机短息消息："+message+"    to:"+toUser);
    }
}
