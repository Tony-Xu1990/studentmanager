package com.lovo.studengmanager.dao;

import com.lovo.studengmanager.beans.StudentInfo;

public interface IStudentInfoDao {
	public void addStudent(StudentInfo stuinfo);
	public void updateStudent(StudentInfo stuinfo);
	public void delStudent(StudentInfo stuinfo);
	public StudentInfo selStudent();
}
