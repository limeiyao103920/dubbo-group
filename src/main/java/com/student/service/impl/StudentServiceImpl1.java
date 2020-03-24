package com.student.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.student.pojo.MyInteger;
import com.student.pojo.Student;
import com.student.service.StudentService;

public class StudentServiceImpl1  implements StudentService{

	@Override
	public Student getById(int id) {
		System.out.println(" 服务端11111 getById 方法被调用");
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Student student = new Student();
		student.setId(id);
		student.setName("服务一  Sutent:" + id);
		student.setAge(15 + new Random().nextInt(10));
		student.setGender("女");
		return student;
	}

	@Override
	public int getAge(Student student) {
		System.out.println(" 服务端 11111 getAge 方法被调用");
	
		try {
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return student.getAge();
	}

	@Override
	public List<String> getStus() {
			ArrayList<String> list = new ArrayList<String>() ;
			list.add("a1");
			list.add("b1");
			list.add("c1");
			return list;
		}

	@Override
	public MyInteger calTotal() {
		return new MyInteger(10);
	}

	
}
