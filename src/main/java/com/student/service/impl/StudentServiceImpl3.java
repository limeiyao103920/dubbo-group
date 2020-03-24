package com.student.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.student.pojo.MyInteger;
import com.student.pojo.Student;
import com.student.service.StudentService;

public class StudentServiceImpl3 implements StudentService{

	@Override
	public Student getById(int id) {
		System.out.println(" 服务端 333333333333getById 方法被调用");
		Student student = new Student();
		student.setId(id);
		student.setName("服务三  testSutent:" + id);
		student.setAge(15 + new Random().nextInt(10));
		student.setGender("女");
		return student;
	}
	
	@Override
	public List<String> getStus() {
			 ArrayList<String> list = new ArrayList<String>() ;
			 list.add("a3");
			 list.add("b3");
			 list.add("c4");
			 return list;
			 
			
		}

	@Override
	public int getAge(Student student) {
		System.out.println(" 服务端 getAge 方法被调用");
		return student.getAge();
	}
	
	@Override
	public MyInteger calTotal() {
		return new MyInteger(40);
	}

	
}
