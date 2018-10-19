package filter;

import pojo.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by 马昕 on 2018/10/18.
 */
//这里要调用tomcat/lib下的servlet-api包
public class ControlFilter  implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        //1. 接受用户请求得到地址
        String url=request.getServletPath();
        //2. 判断用户请求得到地址
        if(url.equals("/register.action")){
            request.getRequestDispatcher("/register.jsp").forward(servletRequest,servletResponse);
            return;
        }else if(url.equals("/saveUser.action")){
            String username=servletRequest.getParameter("username");
            String password=servletRequest.getParameter("password");
            String password1=servletRequest.getParameter("password1");
            System.out.println("++++++++++++"+username+password+password1+"+++++++++++++");
            if(password.equals(password1)){
                User user=new User();
                user.setUserName(username);
                user.setPassword(password);
                //执行DAO操作
                request.getRequestDispatcher("/end.jsp").forward(servletRequest,servletResponse);
            }else{
                request.getRequestDispatcher("/register.jsp").forward(servletRequest,servletResponse);

            }
        }
        //3. 跳转到相应的结果页面
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
