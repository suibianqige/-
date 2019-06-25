package composit;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 14:44
 * 组合模式 : 类似于算法中的递归算法
 *
 * 个人理解能否使用组合模式看元素之间的相似度。
 *
 * 继承一个共有组件类，需要用到的方法由子组件复写，用不到的使用父类的缺省实现
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

        leaf1.addNode(new Composit("叶子节点增加中间节点"));

        root.printName(0);
    }
}
