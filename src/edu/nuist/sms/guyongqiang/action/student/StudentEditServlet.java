package edu.nuist.sms.guyongqiang.action.student;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import edu.nuist.sms.guyongqiang.dao.IStudentDao;
import edu.nuist.sms.guyongqiang.dao.StudentDao;
import edu.nuist.sms.guyongqiang.entity.Student;
import edu.nuist.sms.guyongqiang.util.Myutil;

public class StudentEditServlet extends HttpServlet {

	private IStudentDao studentDao =new StudentDao();
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
			@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.设置请求的字符集编码
		request.setCharacterEncoding("utf-8");
				//1.取得用户修改时所输入的或选择的信息
		int id = Integer.parseInt(request.getParameter("id"));
		String account = request.getParameter("account");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String studyNumber = request.getParameter("studyNumber");
		String genderString = request.getParameter("gender");//"true"|"false"
		Boolean gender = Boolean.parseBoolean(genderString);//"true"->true|"false"->false
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String birthdayString = request.getParameter("birthday");//1995-08-18
		String[] interestArray = request.getParameterValues("interest");
		String birthPlace = request.getParameter("birthPlace");
		String introduction = request.getParameter("introduction");
		//2.将获得的信息封装成一个Student对象
		Student student = new Student();
		try{
		student.setId(id);
		student.setAccount(account);
		student.setName(name);
		student.setPassword(password);
		student.setStudyNumber(studyNumber);
		student.setGender(gender);
		student.setPhone(phone);
		student.setEmail(email);
		student.setBirthday(sdf.parse(birthdayString));
		student.setInterest(Myutil.stringArrayToString(interestArray));
		student.setBirthPlace(birthPlace);
		student.setIntroduction(introduction);
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		//3。调用StudentDao的update方法将该对象对应的数据更新到数据库表中
		studentDao.update(student);
		//4.重定向到学生列表的请求
	response.sendRedirect("student_list");
		
	}
	
	
}
