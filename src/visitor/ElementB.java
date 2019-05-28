package visitor;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 21:51
 * @Description: 说明
 */
public class ElementB extends Element {
    @Override
    void accept(Visitor visitor) {
        visitor.visiteB(this);
    }
}
