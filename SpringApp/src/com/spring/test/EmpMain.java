package com.spring.test;
import com.spring.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/test/config.xml");
		
		Employee em = (Employee)ctx.getBean("emp");
		System.out.println(em.getEmpno() + "\t" + em.getEmpname() + "\t" + em.getEmpjob() + "\t" + em.getSalary());		
	}

}
