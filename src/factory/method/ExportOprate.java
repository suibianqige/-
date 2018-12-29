package factory.method;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2018/12/3 11:29
 */
public abstract class ExportOprate {

    /**
     * 导出文件
     */
    public void export(){
        System.out.println("导出文件");
        ExportApi api = exportFactoryMethod();
        api.export();
    }

    protected abstract ExportApi exportFactoryMethod();
}
