package com.student;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.pojo.MyInteger;
import com.student.pojo.Student;
import com.student.service.StudentService;

public class ConsumerStart {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = 
				 new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
		context.start();
		
		
	
	  /* for (int i = 0; i < 10; i++) {
		   StudentService studentService = (StudentService)context.getBean("myStudenta");
		   Student student = new Student();
		   student.setAge(31);
		   int age =  studentService.getAge(student);
		   System.out.println("age is " + age);
	}*/
		
		
		/*StudentService studentServiceb = (StudentService)context.getBean("myStudenta");
		Student studentb = new Student();
		studentb.setAge(32);
		int ageb =  studentServiceb.getAge(studentb);
		System.out.println("age is " + ageb);*/
		
		// 测试分组合并
		 StudentService studentService = (StudentService)context.getBean("myStudentc");
		 List<String> list = studentService.getStus();
		 list.stream().forEach(x->{System.out.println("名单是 " + x);});
		 
		 MyInteger calTotal = studentService.calTotal();
		 System.out.println("calTotal is " + calTotal);
		
		

		
		 Thread.sleep(10000);
		
		
		
		
	}
	

}
