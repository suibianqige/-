package facade;

import facade.moduleinterface.AbsFactory;
import facade.moduleinterface.ModuleA;
import facade.moduleinterface.ModuleB;
import facade.moduleinterface.ModuleC;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/29 11:42
 * @see AbsFactory
 */
public class AbsFactoryImpl implements AbsFactory {
    @Override
    public ModuleA createModuleA() {
        return new ModuleAImpl();
    }

    @Override
    public ModuleB createModuleB() {
        return new ModuleBImpl();
    }

    @Override
    public ModuleC createModuleC() {
        return new ModuleCImpl();
    }
}
