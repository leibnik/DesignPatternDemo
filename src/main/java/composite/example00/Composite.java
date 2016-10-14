package composite.example00;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leibnik on 16-10-14.
 */
public class Composite extends Component{

    /**
     * 存储节点的容器
     */
    private List<Component> components = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if ( null != components){
            for (Component c : components){
                c.doSomething();
            }
        }
    }

    /**
     * 添加子节点
     * @param child
     */

    public void addChild(Component child){
        components.add(child);
    }

    /**
     * 删除子节点
     * @param child
     */
    public void removeChild(Component child){
        components.remove(child);
    }

    /**
     * 获取子节点
     * @param index
     * @return 子节点
     */
    public Component getChildren(int index){
        return components.get(index);
    }

}
