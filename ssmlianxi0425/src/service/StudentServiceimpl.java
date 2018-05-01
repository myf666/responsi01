package service;

import bean.Student;
import dao.IStudentDao;

public class StudentServiceimpl implements IStudentService {
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
