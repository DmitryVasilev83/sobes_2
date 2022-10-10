package ru.gb.servlet;

import javax.servlet.*;
import java.io.IOException;

public class HelloServlet implements Servlet {

    private  transient ServletConfig config;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().println("<h1>Hello world</h1>");
    }

    @Override
    public String getServletInfo() {
        return "HelloServlet";
    }

    @Override
    public void destroy() {

    }
}
