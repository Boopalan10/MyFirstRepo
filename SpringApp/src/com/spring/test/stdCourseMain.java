package com.spring.test;
import com.spring.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stdCourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/test/stdcourseconfig.xml");
		
		Student st = (Student)ctx.getBean("stdObj1");
		
		System.out.println("Student Name : " + st.getSname());
		System.out.println("Course Info : " + st.getCour().toString());
		System.out.println("Student Location : " + st.getLocation());
		
		System.out.println("==========================");
		Student st1 = (Student)ctx.getBean("stdObj2");
		
		System.out.println("Student Name : " + st1.getSname());
		System.out.println("Course Info : " + st1.getCour().toString());
		System.out.println("Student Location : " + st1.getLocation());
	}

}
