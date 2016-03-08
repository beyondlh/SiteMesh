package com.lh;

import javax.servlet.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lh on 2016/3/8.
 */
public class myfilter implements Filter {
    private String encoding;
    private Map<String,String> params = new HashMap<String,String>();
    @Override
    public void destroy() {
        encoding = null;
        params  =   null;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("begin do the encoding filter!");
        encoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(encoding);
        servletResponse.setCharacterEncoding(encoding);
        filterChain.doFilter(servletRequest,servletResponse);

    }
}
