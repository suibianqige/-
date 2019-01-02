package bridge.kind;

import bridge.method.MessageImplor;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 10:36
 *
 * 站内消息
 */
public class SiteMessage extends AbsMessage {

    public SiteMessage(MessageImplor messageImpl) {
        super(messageImpl);
        explain();
    }

    public void explain(){
        System.out.println("站内消息有一个跟加急消息不同的通知消息");
    }
}
