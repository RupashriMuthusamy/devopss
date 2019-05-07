package kce.student.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import antlr.collections.List;
import kce.student.model.Login;
import kce.student.service.Studentservice;

@Controller
public class StudentController {
	@Autowired
	Studentservice service;

	@Autowired
	HttpServletRequest request;
		
	@RequestMapping("/")
	//@ResponseBody
	public String model(Model theModel) {
		theModel.addAttribute("stu",new Login());
		return "login";
	}

	@PostMapping("/insertUser")//@GetMapping("")
	public String insertUser(@ModelAttribute("ogin") Login s1,Model theModel) {
		service.createStudent(s1);
		List<Login> students = service.getStudents();
		theModel.addAttribute("students",students);
		return "register";
	}

	@RequestMapping("/read")
	public String read(Model theModel) {
		List<Login> students = service.getStudents();
		theModel.addAttribute("students",students);
		return "register";
	}

	@RequestMapping("/editStudent")
	public String editStudent(@RequestParam("id") String id,Model theModel) {
		theModel.addAttribute("stu",service.getStudent(id));
		return "login";
	}


	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("id") String id) {
		Login s1 = service.getStudent(id);
		service.deleteUser(s1);
		return "redirect:/read";
	}

}
