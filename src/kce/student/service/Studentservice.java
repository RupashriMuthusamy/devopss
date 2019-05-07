package kce.student.service;

import antlr.collections.List;
import kce.student.model.Login;

public interface Studentservice {
	void createStudent(Login s1);

	List getStudents();

	Login getStudent(String id);

	void deleteUser(Login s1);

}
