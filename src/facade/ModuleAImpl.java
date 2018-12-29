package facade;

import facade.moduleinterface.ModuleA;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/29 11:24
 *
 * 这个实现类可以有多个，抽象工厂的话就需要多个模拟效果，否则没啥意义，这里当然只写一个了
 * 实际上应该是有多个实现的，否则怎么教抽象工厂呢
 */
public class ModuleAImpl implements ModuleA {
    @Override
    public void a1() {
        System.out.println("ModuleA的具体实现1");
    }
}
