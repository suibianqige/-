package visitor;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 21:46
 * @Description: 说明
 */
public class ElementA extends Element {

    @Override
    void accept(Visitor visitor) {
        visitor.visiteA(this);
    }
}
