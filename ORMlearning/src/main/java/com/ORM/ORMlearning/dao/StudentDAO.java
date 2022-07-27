package com.ORM.ORMlearning.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ORM.ORMlearning.entities.Student;

public class StudentDAO {
	

	private HibernateTemplate hiber;
	
	
	public HibernateTemplate getHiber() {
		return hiber;
	}


	public void setHiber(HibernateTemplate hiber) {
		this.hiber = hiber;
	}


	@Transactional //only with create, delete and update cause they involve data writing
	public int insert(Student st)
	{
		Integer i = (Integer)this.hiber.save(st);
		return i;
	}
	
	public List<Student> getAllStudents()
	{
		List<Student> stu = this.hiber.loadAll(Student.class);
		return stu;
	}

}
