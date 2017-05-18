package edu.nuist.sms.guyongqiang.action.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.nuist.sms.guyongqiang.dao.IStudentDao;
import edu.nuist.sms.guyongqiang.dao.StudentDao;
import edu.nuist.sms.guyongqiang.entity.Student;

public class StudentListServlet extends HttpServlet {

	private IStudentDao studentDao =new StudentDao();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//依赖Dao组件查询出所有学生的集合
		List<Student> studentList = studentDao.getAll();
		//将学生集合放在请求的属性中，到下一个页面使用
				request.setAttribute("studentList",studentList);
				//将请求转发到学生列表页面
				request.getRequestDispatcher("student_list.jsp").forward(request, response);
		
	}
	
	
}
