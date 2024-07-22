package com.tka.ClassRoomFacultyManagment1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.CoursesDao;
import com.tka.entity.Course;

@Service
public class CourseService {

	@Autowired
	CoursesDao coursesDao;

	public List<String> getallcourses() {

		List<Course> fetchcoursessall = coursesDao.getallCourses();
		ArrayList<String> listcourse = new ArrayList<>();

		for (Course course : fetchcoursessall) {
			listcourse.add(course.getName());
		}

		return listcourse;
	}
	// fetch Data

//INSERT Data

	public void saveCourse(Course course) {
		coursesDao.saveCourseDao(course);

	}

	public Course getCourseById(int id) {

		return coursesDao.getCourseById(id);
	}

	public Course updateCourse(int id, Course course) {
		Course existingCourse = getCourseById(id);
		if (existingCourse != null) {
			existingCourse.setName(course.getName());
		}
		return coursesDao.updatecourse(existingCourse);

	}

	public void deletCourseService(int id) {
		coursesDao.deletcourseDao(id);

	}

}
