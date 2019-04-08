package chainfilter.filter.impl;

import chainfilter.filter.Filter;
import chainfilter.model.Request;
import chainfilter.model.Response;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/4/8 14:08
 */
public class HtmlFilter implements Filter {

    private static final String HTML = "html";
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String res = request.getReqStr();
        System.out.println("--->HtmlFilter");
        if(res.contains(HTML)){
            res = res.replaceAll(HTML,"超文本");
            request.setReqStr(res);
        }
        filterChain.doFilter(request,response,filterChain);
        response.setRepStr(response.getRepStr()+"--->HtmlFilter");
    }
}
