package visitor;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 21:39
 * @Description: 被访问的元素抽象类
 */
public abstract class Element {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 接受一个访问者对象
     * 访问者将持有这个对象本身，为其添加一些动态的功能（原来没有的）
     * @param visitor
     */
    abstract void accept(Visitor visitor);
}
