package bridge;

import bridge.kind.AbsMessage;
import bridge.kind.HurryMessage;
import bridge.kind.SiteMessage;
import bridge.method.MailMessage;
import bridge.method.MessageImplor;
import bridge.method.SMSMessage;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 10:14
 *
 * 桥接模式：两个维度上的扩展的组合。
 *
 * 桥接模式类似于一个全连接的操作。例如3*3这样的。在这个栗子里。发送消息的方式有三种 1.手机短信 2.移动电话 3.邮件
 * 消息的种类有两种 1.站内消息 2.加急消息
 * 三种发送消息的方式都是继承统一个接口的，有不同的实现方式。站内消息和加急消息主要的方法：发短息方法是一样的。
 * 但是他们又有不同的部分，都要对消息进行额外处理。所以他们继承同一个抽象类，实现共同的发消息方法。又另外实现自己独特的
 * 业务。这种模式可以进行灵活的排列组合。
 *
 * 目的是让实现部分和抽象部分都可以自有的变更实现
 */
public class TestMain {

    public static void main(String[] args){

        MessageImplor messageImplor = new SMSMessage();
        AbsMessage absMessage = new HurryMessage(messageImplor);

        absMessage.sendMessage("您的话费余额已不足","15380415120");


        MessageImplor messageImplor1 = new MailMessage();
        AbsMessage absMessage1 = new SiteMessage(messageImplor1);

        absMessage1.sendMessage("您已充值30元","15380415120");
    }
}
