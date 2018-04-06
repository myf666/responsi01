package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bean.Student;
import com.service.IStudentService;

public class StudentController implements Controller {
   private IStudentService service;
   
	public void setService(IStudentService service) {

	this.service = service;
}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name=request.getParameter("username");
		String agestr=request.getParameter("age");
		int age=Integer.parseInt(agestr);
		Student student=new Student(name,age);
		service.addStudent(student);
		return new ModelAndView("/WEB-INF/jsp/show.jsp");
	}

}
