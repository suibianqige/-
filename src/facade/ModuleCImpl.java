package facade;

import facade.moduleinterface.ModuleA;
import facade.moduleinterface.ModuleC;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/29 11:24
 */
public class ModuleCImpl implements ModuleC{
    @Override
    public void mc() {
        System.out.println("模块C的某个具体实现");
    }
}
