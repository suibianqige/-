package visitor;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 21:53
 * @Description: 说明
 */
public class TestMain {



    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.setVisitor(new VisitorImpl());
        objectStructure.add(new ElementA()).add(new ElementB());

        objectStructure.doVisite();
    }
}
