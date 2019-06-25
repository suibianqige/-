package chainfilter;

import chainfilter.filter.Filter;
import chainfilter.filter.impl.FaceFilter;
import chainfilter.filter.impl.FilterChain;
import chainfilter.filter.impl.HtmlFilter;
import chainfilter.filter.impl.ScriptFilter;
import chainfilter.model.Request;
import chainfilter.model.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/4/8 11:17
 *
 * 责任链模式  以拦截器为例
 */
public class TestMain {

    public static void main(String[] args){

        Request request = new Request("zhe shi yi ge bao han -_-!, script, he html de request");
        FilterChain filterChain = new FilterChain();
        List<Filter> list = new ArrayList<>(3);
        filterChain.setFilters(list);


        filterChain.addFilter(new FaceFilter());
        filterChain.addFilter(new HtmlFilter());
        filterChain.addFilter(new ScriptFilter());

        Response response = new Response("返回数据");
        filterChain.doFilter(request,response,filterChain);

        System.out.println(response.getRepStr());
        System.out.println(request.getReqStr());
    }
}
