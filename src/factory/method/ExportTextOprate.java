package factory.method;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/3 11:32
 */
public class ExportTextOprate extends ExportOprate {
    @Override
    protected ExportApi exportFactoryMethod() {
        return new ExportTextApi();
    }
}
