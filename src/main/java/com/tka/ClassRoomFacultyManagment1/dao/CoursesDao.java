package com.tka.ClassRoomFacultyManagment1.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tka.entity.Course;

import jakarta.persistence.criteria.CriteriaBuilder;

@Repository
public class CoursesDao {

	@Autowired
	SessionFactory factory;

	public List<Course> getallCourses() {

		Session session = factory.openSession();
		CriteriaBuilder criteria = session.createCriteria(Course.class);

		List<Course> list = criteria.list();
		System.out.println(list);
		return list;
	}

	public Course getCourseById(int id) {
		Session session = null;
		Course course = null;
		try {
			session = factory.openSession();
			course = session.get(Course.class, id);
			System.out.println("Data show Sucessfully :" + course);

		} finally {
			if (session != null) {

				session.close();
			}
		}

		return course;
	}

	@Transactional(readOnly = true)
	public void saveCourseDao(Course course) {
		Session session = null;
		try {

			session = factory.openSession();
			session.beginTransaction();
			session.save(course);
			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public Course updatecourse(Course existingCourse) {
		Session session = null;
		try {

			session = factory.openSession();
			session.beginTransaction();
			session.update(existingCourse);
			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
		return existingCourse;
	}

	@Transactional(readOnly = true)
	public void deletcourseDao(int id) {
		Session session = null;
		try {

			session = factory.openSession();
			session.beginTransaction();
			Course course = session.get(Course.class, id);
			session.delete(course);
			session.getTransaction().commit();
			System.out.println("Data Delet Sucessfully");

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

}
