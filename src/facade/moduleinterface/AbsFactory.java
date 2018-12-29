package facade.moduleinterface;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/29 11:33
 * 这个是一个抽象工厂接口
 *
 * 定义了要返回哪些类型的模块，说白了就是定义一个产品簇。
 * 这样替换这个产品簇的实现非常方便，只需要添加某一个某块的具体实现
 * 和增加一个工厂接口的具体实现就可以了。
 * 但是缺点就是不好横向扩展，
 * 一旦添加一个其他模块例如ModuleD，就会牵一发而动全身，很麻烦。
 */
public interface AbsFactory {

    ModuleA createModuleA();

    ModuleB createModuleB();

    ModuleC createModuleC();
}
