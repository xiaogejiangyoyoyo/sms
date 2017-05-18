package edu.nuist.sms.guyongqiang.action.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import edu.nuist.sms.guyongqiang.dao.IStudentDao;
import edu.nuist.sms.guyongqiang.dao.StudentDao;
import edu.nuist.sms.guyongqiang.entity.Student;

public class StudentToEditServlet extends HttpServlet {

	private IStudentDao studentDao =new StudentDao();
	
			@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				//1.获得请求中的id值
				int id = Integer.parseInt(request.getParameter("id"));
				//2.根据id值获得学生对象
				Student student = studentDao.get(id);
				//3.将获得的学生对象放在请求的属性中，到学生明细页面去显示使用
				request.setAttribute("student", student);
				//4.将请求转发到学生明细页面student_edit.jsp
				request.getRequestDispatcher("student_edit.jsp").forward(request,response);
			}
}
