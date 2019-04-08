package chainfilter.filter;

import chainfilter.filter.impl.FilterChain;
import chainfilter.model.Request;
import chainfilter.model.Response;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/4/8 11:18
 *
 * 拦截器接口
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);
}
