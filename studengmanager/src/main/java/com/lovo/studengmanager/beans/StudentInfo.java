package com.lovo.studengmanager.beans;

import java.io.Serializable;

public class StudentInfo implements Serializable {
	private String stuName;
	private String gender;
	private int age;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public StudentInfo(String stuName, String gender, int age) {
		super();
		this.stuName = stuName;
		this.gender = gender;
		this.age = age;
	}
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentInfo [stuName=" + stuName + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
