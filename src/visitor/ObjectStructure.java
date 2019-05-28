package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 21:49
 * @Description: 这个类负责为一系列的类添加职责
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>(2);

    private Visitor visitor;

    public List<Element> getList() {
        return list;
    }

    public List<Element> add(Element element){
        this.list.add(element);
        return this.list;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public void  doVisite(){
        list.stream().forEach(element -> element.accept(visitor));
    }
}
