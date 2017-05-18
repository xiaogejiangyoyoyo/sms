package edu.nuist.sms.guyongqiang.action.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import edu.nuist.sms.guyongqiang.dao.IStudentDao;
import edu.nuist.sms.guyongqiang.dao.StudentDao;

public class StudentDeleteServlet extends HttpServlet {

	private IStudentDao studentDao =new StudentDao();
	
				@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
				//1.取得需要删除学生的id价值
					int id = Integer.parseInt(request.getParameter("id"));//"1"->1
					//2.调用studentDao的delete方法删除数据
					studentDao.delete(id);
					//3.重定向到student_list请求
					response.sendRedirect("student_list");
					
				
				
				
				
				
				}
}
