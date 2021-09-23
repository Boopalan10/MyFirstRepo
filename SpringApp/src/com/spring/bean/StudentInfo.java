package com.spring.bean;
import java.util.*;

public class StudentInfo {
	private String stdname;
	private Address adrs;
	private List<String> qualification;
	private Set<String> courses;
	private Map<String, String> course_and_faculty;
	private Properties course_and_cost;
	
	public String getStdname() {
		return stdname;
	}	
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	
	public Address getAdrs() {
		return adrs;
	}
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	
	public List<String> getQualification() {
		return qualification;
	}
	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}
	
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public Map<String, String> getCourse_and_faculty() {
		return course_and_faculty;
	}
	public void setCourse_and_faculty(Map<String, String> course_and_faculty) {
		this.course_and_faculty = course_and_faculty;
	}
	public Properties getCourse_and_cost() {
		return course_and_cost;
	}
	public void setCourse_and_cost(Properties course_and_cost) {
		this.course_and_cost = course_and_cost;
	}
	
	public void printStdinfo()
	{
		System.out.println(stdname + "\t" + adrs);
		System.out.println(qualification);
		System.out.println(courses);
		System.out.println(course_and_faculty);
		System.out.println(course_and_cost);
	}
}
