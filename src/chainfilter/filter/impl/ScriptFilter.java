package chainfilter.filter.impl;

import chainfilter.filter.Filter;
import chainfilter.model.Request;
import chainfilter.model.Response;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/4/8 14:09
 */
public class ScriptFilter implements Filter {

    private static final String SCRIPT = "script";
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String res = request.getReqStr();
        System.out.println("--->ScriptFilter");
        if(res.contains(SCRIPT)){
            res = res.replaceAll(SCRIPT,"脚本");
            request.setReqStr(res);
        }
        filterChain.doFilter(request,response,filterChain);
        response.setRepStr(response.getRepStr()+"--->ScriptFilter");
    }
}
