package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import bean.Student;
import service.IStudentService;

public class StudentController implements Controller {
	private IStudentService service;
    
	public void setService(IStudentService service) {
		
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
      
		String name=request.getParameter("name");
       String strage=request.getParameter("age");
       int age=Integer.valueOf(strage);
       Student student=new Student(name,age);
       System.out.println(student);
         service.addStudent(student);
		return new ModelAndView("/show.jsp");
	}

}
