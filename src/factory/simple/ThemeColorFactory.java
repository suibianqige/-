package factory.simple;

import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/3 11:47
 * 主题工厂：根据不同配置生成不同的主题色
 */
public class ThemeColorFactory {

    /**
     * 根据配置文件生成主题
     * @return
     * @throws Exception
     */
    public ThemeColor getThemeColor()throws Exception{
        //加载配置文件
        Properties properties = new Properties();
        InputStream is = ThemeColorFactory.this.getClass().getResourceAsStream("a.properties");
        properties.load(is);
        String className = properties.getProperty("cName");
        Class clazz = Class.forName(className);
        ThemeColor themeColor = (ThemeColor) clazz.newInstance();
        return themeColor;
    }
}
