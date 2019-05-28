package visitor;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 21:48
 * @Description: 说明
 */
public class VisitorImpl extends Visitor {
    @Override
    public void visiteA(Element element) {
        System.out.println("为elementA添加功能");
    }

    @Override
    public void visiteB(Element element) {

        System.out.println("为elementB添加功能");
    }
}
