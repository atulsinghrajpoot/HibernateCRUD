package com.inn.hibernate.util;

import com.inn.hibernate.dao.IHibernateDao;
import com.inn.hibernate.dao.impl.HibernateDaoImpl;
import com.inn.hibernate.model.Student;

public class Initializer {
	
	public static void main(String[] args) {
		System.out.println("Started successfully");
		try{

			Student student = new Student();
			student.setCource("MCA");
			student.setName("Atul Rajpoot");
			student.setRollNumber(123);
			
			IHibernateDao<Student> dao= new HibernateDaoImpl<Student>(Student.class);
			student = dao.save(student);
			System.out.println("Record saved successfully id: "+ student);
			
			student.setName("Amit Rajpoot");
			student = dao.update(student);
			System.out.println("Record updated successfully id: "+ student);
			
			student = dao.findByPrimaryKey(student.getId());
			System.out.println("Record found success fully id: "+ student);
					
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}

}
