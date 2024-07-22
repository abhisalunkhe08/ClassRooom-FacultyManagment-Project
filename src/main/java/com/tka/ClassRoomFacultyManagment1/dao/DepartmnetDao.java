package com.tka.ClassRoomFacultyManagment1.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tka.entity.Department;

@Repository
public class DepartmnetDao {

	@Autowired
	SessionFactory factory;

// fetch Data 
	public List<Department> getalldeparments() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Department.class);

		List<Department> list = criteria.list();
		System.out.println(list);
		return list;
	}

//INSERT Data
	@Transactional(readOnly = true)
	public void saveDao(Department department) {
		Session session = null;
		try {

			session = factory.openSession();
			session.beginTransaction();
			session.save(department);
			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Department getdepartmentById(int id) {
		Session session = null;
		Department department = null;
		try {
			session = factory.openSession();
			department = session.get(Department.class, id);
			System.out.println("Data show Sucessfully :" + department);

		} finally {
			if (session != null) {

				session.close();
			}
		}

		return department;
	}

	public Department updatecourse(Department department) {
		Session session = null;
		try {

			session = factory.openSession();
			session.beginTransaction();
			session.update(department);
			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
		return department;
	}

}
