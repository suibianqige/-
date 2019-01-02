package bridge.method;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 10:25
 *
 * 邮件发送方式
 */
public class MailMessage implements MessageImplor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("邮件发送消息："+message+"    to:"+toUser);
    }
}
