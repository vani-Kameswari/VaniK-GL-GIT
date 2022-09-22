package lab.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lab.student.*;
import lab.student.entity.Student;
import lab.student.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	// add mapping for "/list"

	@RequestMapping("/list")
	public String liststudents(Model theModel) {

		System.out.println("request recieved for List of Students");
		// get students from db
		List<Student> theStudents = studentService.findAll();

		// add to the spring model
		theModel.addAttribute("Students", theStudents);

		return "list-Student";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		System.out.println("request recieved for Adding Students");
		// create model attribute to bind form data
		Student theStudent = new Student();

		theModel.addAttribute("Student", theStudent);

		return "Student-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int theId, Model theModel) {
		System.out.println("request recieved for Updating Students");

		// get the students from the service
		Student theStudent = studentService.findById(theId);

		// set student as a model attribute to pre-populate the form
		theModel.addAttribute("Student", theStudent);

		// send over to our form
		return "Student-form";
	}

	@PostMapping("/save")
	public String saveBook(@RequestParam("id") int id, @RequestParam("studentName") String studentName,
			@RequestParam("department") String department, @RequestParam("country") String country)
			{

		System.out.println("request recieved for Save Student");	
		System.out.println(id);
		Student theStudent;
		if (id != 0) {
			theStudent = studentService.findById(id);
			theStudent.setstudentName(studentName);
			theStudent.setDepartment(department);
			theStudent.setCountry(country);
		} else
			theStudent = new Student(studentName, department, country);
		// save the student
		studentService.save(theStudent);

		// use a redirect to prevent duplicate submissions
		return "redirect:/student/list";

	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("studentId") int theId) {

		// delete the student
		studentService.deleteById(theId);

		// redirect to /student/list
		return "redirect:/student/list";

	}

}