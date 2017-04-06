package com.lovo.studengmanager.service;

import com.lovo.studengmanager.beans.StudentInfo;

public interface IStudentInfoService {
	public void addStudent(StudentInfo stuinfo);
	public void updateStudent(StudentInfo stuinfo);
	public void delStudent(StudentInfo stuinfo);
	public StudentInfo selStudent();
}
