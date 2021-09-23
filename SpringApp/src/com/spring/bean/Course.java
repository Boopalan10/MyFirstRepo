package com.spring.bean;

public class Course {
	private String courseName;
	private Float Fees;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Float getFees() {
		return Fees;
	}
	public void setFees(Float fees) {
		Fees = fees;
	}
	
	public String toString()
	{
		return "Course Name : " + courseName + "\tFees : " + Fees;
	}
}
