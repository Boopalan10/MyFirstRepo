package com.spring.bean;

public class Employee {
private Integer empno;
private String empname;
private String empjob;
private Float salary;

public Employee(Integer empno, String empname, String empjob, Float salary) {
	super();
	this.empno = empno;
	this.empname = empname;
	this.empjob = empjob;
	this.salary = salary;
}

public Integer getEmpno() {
	return empno;
}

public String getEmpname() {
	return empname;
}

public String getEmpjob() {
	return empjob;
}

public Float getSalary() {
	return salary;
}

}
