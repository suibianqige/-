package bridge.kind;

import bridge.method.MessageImplor;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 10:38
 *
 * 加急类型的消息多一个监控方法
 */
public class HurryMessage extends AbsMessage {

   /* public HurryMessage() {
    }*/

    public HurryMessage(MessageImplor messageImpl) {
        super(messageImpl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        watch();
        super.sendMessage(message, toUser);
    }

    public void watch(){
        System.out.println("监控方法开始工作");
    }
}
