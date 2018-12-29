package factory.method;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/11/30 16:15
 */
public class ExportTextApi implements ExportApi {
    @Override
    public void export() {
        System.out.println("导出文本文件");
    }
}
