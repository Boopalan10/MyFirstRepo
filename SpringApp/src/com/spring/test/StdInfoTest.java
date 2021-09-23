package com.spring.test;
import com.spring.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StdInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/test/stdinfo.xml");
		
		StudentInfo si = (StudentInfo)ctx.getBean("stdinfoobj");
		si.printStdinfo();
	}

}
