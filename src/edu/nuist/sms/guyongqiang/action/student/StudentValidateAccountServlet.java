package edu.nuist.sms.guyongqiang.action.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import edu.nuist.sms.guyongqiang.dao.IStudentDao;
import edu.nuist.sms.guyongqiang.dao.StudentDao;
import edu.nuist.sms.guyongqiang.entity.Student;

public class StudentValidateAccountServlet extends HttpServlet {

	private IStudentDao studentDao =new StudentDao();
	
				@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//0.将请求的编码改成UTF-8
					request.setCharacterEncoding("UTF-8");
									//1.取得请求中账号的值
					String account = request.getParameter("account");
					//2.调用studentDao的getByAccount方法获取数据
					Student student = studentDao.getByAccount(account);
					//3.判断该学生是否存在
					//3.1学生不存在
					response.setContentType("text/html;charset=UTF-8");
					PrintWriter out = response.getWriter();
					if(student!=null){
						//json格式{"key1":"value1","key2":"value2"}
						out.write("{\"exists\":true}");
											}
					//3.2学生不存在
					else{
						out.write("{\"exists\":false}");
					}
				
				
				
				
				
				}
}
