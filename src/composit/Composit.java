package composit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 14:45
 *
 * 中间节点
 */
public class Composit extends Component {

    private List<Component> childNodes;

    public Composit(String name) {
        super(name);
    }

    @Override
    public void printName(int level) {
        super.printName(level);
        if(this.childNodes != null){
            for(Component component:this.childNodes){
                component.printName(level+1);
            }
        }
    }

    @Override
    public void addNode(Component component) {
        if(childNodes == null){
            childNodes = new ArrayList<>();
        }
        this.childNodes.add(component);
    }

    @Override
    public void deleteNode(int index) {
        if(childNodes == null){
            super.deleteNode(index);
        }
        this.childNodes.remove(index);
    }

    @Override
    public List<Component> getNodes() {
        return this.childNodes;
    }
}
