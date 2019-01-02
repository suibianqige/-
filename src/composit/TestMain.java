package composit;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 14:44
 * 组合模式
 */
public class TestMain {

    public static void main(String[] args){
        Component leaf1 = new Leaf("叶子结点1");
        Component leaf2 = new Leaf("叶子结点2");
        Component leaf3 = new Leaf("叶子结点3");
        Component leaf4 = new Leaf("叶子结点4");
        Component leaf5 = new Leaf("叶子结点5");

        Component root = new Composit("根节点");
        Component composit1 = new Composit("中间节点1");
        Component composit2 = new Composit("中间节点2");

        root.addNode(composit1);
        root.addNode(leaf1);
        root.addNode(leaf2);
        composit1.addNode(composit2);
        composit2.addNode(leaf3);
        composit2.addNode(leaf4);
        composit2.addNode(leaf5);

        root.printName(0);
    }
}
