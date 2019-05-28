package State2;

/**
 * @Author: 杨长江
 * @Date: 2019-05-28 20:43
 * @Description: 数据模型
 */
public class BusinessModel {

    private String name;

    private String beginDate;

    private int days;

    private String result;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public BusinessModel(String name, String beginDate, int days) {
        this.name = name;
        this.beginDate = beginDate;
        this.days = days;
    }
}
