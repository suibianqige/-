package facade;

import facade.moduleinterface.ModuleA;
import facade.moduleinterface.ModuleB;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/29 11:24
 * 说明请看下面链接
 * @see  facade.ModuleAImpl
 */
public class ModuleBImpl implements ModuleB {
    @Override
    public void modulemmm() {
        System.out.println("模块B的一个具体实现类的一个具体的方法实现1");
    }
}
