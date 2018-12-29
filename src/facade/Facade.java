package facade;

import facade.moduleinterface.AbsFactory;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/29 11:44
 *
 * 额，有点脱离主题，讲的是外观者模式
 *
 * 现在完成一个test功能需要涉及三个模块ABC
 */
public class Facade {
    private AbsFactory absFactory;

    public Facade(AbsFactory absFactory) {
        this.absFactory = absFactory;
    }

    public void test(){

        absFactory.createModuleA().a1();
        absFactory.createModuleB().modulemmm();
        absFactory.createModuleC().mc();
    }
}
