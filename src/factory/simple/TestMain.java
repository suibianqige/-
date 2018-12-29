package factory.simple;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/3 14:06
 *
 * 简单工厂核心思想：选择实现，工厂通过不同条件选择实现接口的子类，调用者不知道具体实现那个子类，屏蔽细节
 */
public class TestMain {

    public static void main(String[] args)throws Exception{
        ThemeColorFactory factory = new ThemeColorFactory();
        ThemeColor themeColor = factory.getThemeColor();
        themeColor.showColor();
    }
}
