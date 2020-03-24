package com.student.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.student.pojo.MyInteger;
import com.student.pojo.Student;
import com.student.service.StudentService;

public class StudentServiceImpl2  implements StudentService{

	@Override
	public Student getById(int id) {
		System.out.println(" 服务端 222222222222getById 方法被调用");
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Student student = new Student();
		student.setId(id);
		student.setName("  服务二 Sutent:" + id);
		student.setAge(15 + new Random().nextInt(10));
		student.setGender("女");
		return student;
	}

	@Override
	public int getAge(Student student) {
		System.out.println(" 服务端2222 getAge 方法被调用");
		return student.getAge();
	}
	
	@Override
	public List<String> getStus() {
			 ArrayList<String> list = new ArrayList<String>() ;
			 list.add("a2");
			 list.add("b2");
			 list.add("c2");
			 return list;
			
		}
	
	@Override
	public MyInteger calTotal() {
		return new MyInteger(20);
	}

	
}
