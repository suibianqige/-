package chainfilter.filter.impl;

import chainfilter.filter.Filter;
import chainfilter.model.Request;
import chainfilter.model.Response;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/4/8 14:08
 */
public class FaceFilter implements Filter {

    private static final String FACE = "-_-!";
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String res = request.getReqStr();
        System.out.println("--->FaceFilter");
        if(res.contains(FACE)){
            res = res.replaceAll(FACE,"笑脸");
            request.setReqStr(res);
        }
        filterChain.doFilter(request,response,filterChain);
        response.setRepStr(response.getRepStr()+"--->FaceFilter");
    }
}
