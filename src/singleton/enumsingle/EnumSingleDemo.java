package singleton.enumsingle;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/7 10:36
 * 枚举单例（没怎么看懂）
 */
public class EnumSingleDemo {

    private EnumSingleDemo(){}

    public EnumSingleDemo getInstance(){
        return EnumSingle.INSTANCE.newInstance();
    }

    private enum EnumSingle{
        INSTANCE;

        private EnumSingleDemo enumSingleDemo;

        EnumSingle(){
            enumSingleDemo = new EnumSingleDemo();
        }

        public EnumSingleDemo newInstance(){
            return enumSingleDemo;
        }
    }

}
