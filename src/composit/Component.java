package composit;

import java.util.List;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/1/2 14:45
 *
 * 基础的抽象类
 */
public abstract class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 打印节点名称
     */
    public void printName(int level){
        StringBuilder preStr = new StringBuilder();
        for(int i=0;i<level;i++){
            preStr.append("----");
        }
        System.out.println(preStr+name);
    }

    /**
     * 添加节点
     * @param component 节点
     */
    public void addNode(Component component){
        throw new UnsupportedOperationException();
    }

    /**
     * 删除节点
     * @param index 节点编号
     */
    public void deleteNode(int index){
        throw new UnsupportedOperationException();
    }

    /**
     * 获取所有节点
     * @return
     */
    public List<Component> getNodes(){
        throw new UnsupportedOperationException();
    }
}
