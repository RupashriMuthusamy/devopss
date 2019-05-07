package kce.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import kce.student.model.Login;

public class Studentserviceimp implements Studentservice{

	@Autowired
	StudentDao dao;
	
	@Override
	@Transactional
	public void createStudent(Login s1) {
			dao.createStudent(s1);
	}

	@Override
	@Transactional
	public List<Login> getStudents() {
		return dao.getStudents();
	}

	@Override
	@Transactional
	public Login getStudent(String id) {
		return dao.getStudent(id);
	}

	@Override
	@Transactional
	public void deleteUser(Login s1) {
		dao.deleteStudent(s1);
	}

}
