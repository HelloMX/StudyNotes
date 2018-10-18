package com.jikexueyuan.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.jikexueyuan.pojo.Users;

public class ControlFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		//1接收用户请求的地址
		String url = request.getServletPath();
		//2判断用户请求的地址，并执行相应的程序
		if(url.equals("/register.action")){
			request.getRequestDispatcher("register.jsp").forward(arg0, arg1);
			return;
		}else if(url.equals("/saveUser.action")){
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String password1 = request.getParameter("password1");
			if(password.equals(password1)){
				Users us = new Users();
				us.setUsername(username);
				us.setPassword(password);
				//执行相关DAO持久化操作
				request.getRequestDispatcher("end.jsp").forward(arg0, arg1);
				return;
			}else{
				request.getRequestDispatcher("register.jsp").forward(arg0, arg1);
				return;
			}
		}
		//3跳转到相应的结果页面
		arg2.doFilter(arg0, arg1);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
