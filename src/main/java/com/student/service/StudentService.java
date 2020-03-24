package com.student.service;

import java.util.List;

import com.student.pojo.MyInteger;
import com.student.pojo.Student;

public interface StudentService {
	
	// 获取一个学生
	Student getById(int id);
	
	// 获取年龄
	int getAge(Student student);
	
	List<String> getStus();
	
	// 计算总数
	MyInteger calTotal();
	
	
}
