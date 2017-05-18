package edu.nuist.sms.guyongqiang.dao;

import java.util.List;

import edu.nuist.sms.guyongqiang.entity.Student;

public interface IStudentDao {
	public void add(Student student) ;
	
	
	public void delete(int id);
		
	
	public void update(Student student);
	
	
	public Student get(int id);
	
	public Student getByAccount(String account);
	
	
	public List<Student> getAll();
	
	
	}

