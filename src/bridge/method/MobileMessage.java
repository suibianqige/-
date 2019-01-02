package bridge.method;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 10:21
 *
 * 手机短信发送方式
 */
public class MobileMessage implements MessageImplor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("移动电话消息："+message+"    to:"+toUser);
    }
}
