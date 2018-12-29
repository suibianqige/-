package factory.method;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/3 11:24
 * 导出Excel格式文件
 */
public class ExportExcelApi implements ExportApi {
    @Override
    public void export() {
        System.out.println("导出Excel文件");
    }
}
