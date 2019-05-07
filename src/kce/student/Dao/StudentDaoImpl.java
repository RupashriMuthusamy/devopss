package kce.student.Dao;

import javax.management.Query;
import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Repository;


import kce.student.model.Login;

public class StudentDaoImpl implements StudentDao {
	@Autowired
	SessionFactory factory;

	@Override
	public void createStudent(Login s1) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(s1);
	}

	@Override
	public List<Login> getStudents() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Login");
		List<Login> students = ((Object) query).list();
		return students;
	}

	@Override
	public Sandhiya getStudent(String id) {
		org.hibernate.classic.Session session = factory.getCurrentSession();
		Login s1 =session.get(Login.class,Integer.parseInt(id));
		return s1;
	}

	@Override
	public void deleteStudent(Login s1) {
		Session session = factory.getCurrentSession();
		session.delete(s1);
	}
	
}
