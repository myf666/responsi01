package com.service;

import com.bean.Student;
import com.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {
   private IStudentDao dao;
   
	public void setDao(IStudentDao dao) {

	this.dao = dao;
}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
   dao.insertStudent(student);
	}

}
