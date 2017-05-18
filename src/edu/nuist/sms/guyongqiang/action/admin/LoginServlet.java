package edu.nuist.sms.guyongqiang.action.admin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.取得用户输入的账号和密码
		String account =request.getParameter("account".trim());
		String password =request.getParameter("password".trim());
		//2.判断账号密码都是admin的才算成功，否则登录失败
		//2.1登录失败
		if(account.equals("admin") && password.equals("admin")){
			//将登陆成功的账号名称放在会话属性中，以便学生列表页面一直使用
		HttpSession session = request.getSession();
		session.setAttribute("name",account);
		
		//重新将请求重定向到处理学生列表页面的请求
		response.sendRedirect("student_list");
		}
		//2.2登录失败
		else{
		response.sendRedirect("login_fail.jsp");
		}
		
		
				
		}
	}

