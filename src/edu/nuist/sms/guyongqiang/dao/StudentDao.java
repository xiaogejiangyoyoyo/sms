package edu.nuist.sms.guyongqiang.dao;

import java.sql.Connection;
import java.util.List;

import edu.nuist.sms.guyongqiang.entity.Student;
import edu.nuist.sms.guyongqiang.util.JDBCUtil;

public class StudentDao extends BaseDao implements IStudentDao {

	@Override
	public void add(Student student) {
		//JDBC编程
		
		Connection connection = JDBCUtil.getConnection();
		String sql="insert into students(account,name,password,study_number ,gender,phone,email,birthday,interest,birth_place ,introduction) value (?,?,?,?,?,?,?,?,?,?,?)";
		this.update(connection, sql, student.getAccount(),student.getName(),student.getPassword(),student.getStudyNumber(),student.getGender(),student.getPhone(),student.getEmail(),student.getBirthday(),student.getInterest(),student.getBirthPlace(),student.getIntroduction());
	    JDBCUtil.releaseResources(null,null, connection);
		}

	@Override
	public void delete(int id) {
		Connection connection = JDBCUtil.getConnection();
		String sql="delete from students where id=?";
		this.update(connection, sql, id);
	    JDBCUtil.releaseResources(null,null, connection);
		}

	@Override
	public void update(Student student) {
					Connection connection = JDBCUtil.getConnection();
			String sql="update students set account=?,name=?,password=?,study_number=? ,gender=?,phone=?,email=?,birthday=?,interest=?,birth_place=? ,introduction=? where id=?";
			this.update(connection, sql, student.getAccount(),student.getName(),student.getPassword(),student.getStudyNumber(),student.getGender(),student.getPhone(),student.getEmail(),student.getBirthday(),student.getInterest(),student.getBirthPlace(),student.getIntroduction(),student.getId());
		    JDBCUtil.releaseResources(null,null, connection);
			}

	@Override
	public Student get(int id) {
		Connection connection = JDBCUtil.getConnection();
		String sql="select id,account,name,password,study_number as studyNumber ,gender,phone,email,birthday,interest,birth_place as birthPlace ,introduction from students where id=?";
		Student student=this.get(connection,Student.class,sql,id);
	    JDBCUtil.releaseResources(null,null, connection);
				return student;
	}

	@Override
	public List<Student> getAll() {
		Connection connection = JDBCUtil.getConnection();
		String sql="select id,account,name,password,study_number as studyNumber ,gender,phone,email,birthday,interest,birth_place as birthPlace ,introduction from students ";
		List<Student> studentList=this.getAll(connection,Student.class,sql);
	    JDBCUtil.releaseResources(null,null, connection);
				return studentList;
	}

	@Override
	public Student getByAccount(String account){
		Connection connection = JDBCUtil.getConnection();
		String sql="select id,account,name,password,study_number as studyNumber ,gender,phone,email,birthday,interest,birth_place as birthPlace ,introduction from students where account=?";
		Student student=this.get(connection,Student.class,sql,account);
	    JDBCUtil.releaseResources(null,null, connection);
				return student;
	}

	

	

	
	
			
		
	}

	




	
	
	
	
	
	
	
	

