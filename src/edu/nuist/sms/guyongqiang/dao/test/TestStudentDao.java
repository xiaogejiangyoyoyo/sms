package edu.nuist.sms.guyongqiang.dao.test;

import edu.nuist.sms.guyongqiang.dao.IStudentDao;
import edu.nuist.sms.guyongqiang.dao.StudentDao;
import edu.nuist.sms.guyongqiang.entity.Student;

public class TestStudentDao{
	public static void main(String[] args) throws Exception {
	
		IStudentDao studentDao = new StudentDao();
	/*
		Student student = new Student("zhaoliu","zhaoliu","123","NO-04",false,"1333333333","456@126.com",new Date(),"film,sport","3","我是一个好人。");
	
		studentDao.add(student);
*/
	/*	studentDao.delete(6);*/
	/*	Student student = new Student("zhangwuji","张无忌","123","NO-04",false,"1333333333","456@126.com",new Date(),"film,sport","3","我是一个大侠。");
		student.setId(5);
		studentDao.update(student);
		*/
	/*	Student student =studentDao.get(1);
				System.out.println(student);
				*/
		for(Student student:studentDao.getAll()){
		System.out.println(student);
		}
		}
		
}
