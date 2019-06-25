package bridge.kind;

import bridge.method.MessageImplor;
import bridge.method.MobileMessage;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 10:32
 *
 * 消息类型
 * 消息类型的抽象类，具体的实现发送消息方法由外部的接口实现
 * 子类也可以有自己的专有的业务处理方法
 */
public abstract class AbsMessage {

    private MessageImplor messageImpl;

    /*public AbsMessage() {

    }*/

    public AbsMessage(MessageImplor messageImpl) {
        this.messageImpl = messageImpl;
    }

    public void sendMessage(String message,String toUser){
        messageImpl.send(message,toUser);
    }
}
