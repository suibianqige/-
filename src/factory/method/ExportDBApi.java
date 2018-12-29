package factory.method;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/3 11:25
 * 导出DB格式数据
 */
public class ExportDBApi implements ExportApi {
    @Override
    public void export() {
        System.out.println("导出数据库备份文件");
    }
}
