package bridge.method;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 10:18
 *
 * 发送方法
 */
public interface MessageImplor {
    /**
     * 发送消息
     * @param message 消息
     * @param toUser 接受者
     */
    void send(String message,String toUser);
}
