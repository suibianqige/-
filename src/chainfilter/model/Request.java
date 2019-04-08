package chainfilter.model;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/4/8 14:06
 */
public class Request {

    private String reqStr;

    public Request(String reqStr) {
        this.reqStr = reqStr;
    }

    public String getReqStr() {
        return reqStr;
    }

    public void setReqStr(String reqStr) {
        this.reqStr = reqStr;
    }
}
