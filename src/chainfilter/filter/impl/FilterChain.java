package chainfilter.filter.impl;

import chainfilter.filter.Filter;
import chainfilter.model.Request;
import chainfilter.model.Response;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: 杨长江
 * @Description:
 * @Date: 2019/4/8 14:07
 */
public class FilterChain implements Filter {

    private List<Filter> filters;

    private int i = 0;
    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        /*if(filters == null || filters.size() == 0 || filters.size() == i){return;}
        Filter filter = filters.get(i);
        i++;
        filter.doFilter(request,response,filterChain);*/
        while (filters.iterator().hasNext()){
            Filter filter = filters.iterator().next();
            filters.remove(filter);
            filter.doFilter(request,response,this);
        }
    }
}
