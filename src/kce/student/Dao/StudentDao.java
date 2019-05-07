package kce.student.Dao;

import java.util.List;

import kce.student.model.Login;

public interface StudentDao {
	void createStudent(Login s1);

	List<Login> getStudents();

	Login getStudent(String id);

	void deleteStudent(Login s1);
}
