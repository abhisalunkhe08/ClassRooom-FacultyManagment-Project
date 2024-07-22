package com.tka.ClassRoomFacultyManagment1.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tka.entity.Classroom;

@Component
public class ClassroomDao {

	@Autowired
	SessionFactory factory;

//	Fetch Data
	public List<Classroom> allinfoClassroom() {
		System.err.println("in  DAO - allinfoClassroom ");

		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Classroom.class);

		List list = criteria.list();
		System.out.println(list);
		return list;
	}

//	Insert data
	public void allClassroom(Classroom classroom) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(classroom);

		transaction.commit();
		System.out.println("Data Insert Sucesfully");

	}

// Update Data	

	public void updateClassroom(Classroom classroom) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(classroom);
		transaction.commit();
		System.out.println("Data Update scueesfully");

	}
//	Delet Data

	public void deletclassroom(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Classroom classroom = session.get(Classroom.class, id);
		session.delete(classroom);
		transaction.commit();
		System.out.println("Data Delet Sucessfully");

	}
}
