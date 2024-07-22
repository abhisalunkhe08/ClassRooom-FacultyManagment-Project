package com.tka.ClassRoomFacultyManagment1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Course;
import com.tka.service.CourseService;

@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired
	CourseService courseService;

	@GetMapping("/course")
	public List<String> getallcourses() {

		return courseService.getallcourses();
	}

//Fetch Data by Id
	@GetMapping("/{id}")
	public Course getCourseById(@PathVariable int id) {
		System.out.println(id);
		return courseService.getCourseById(id);
	}
//	Insert Data

	@PostMapping("/insertcourse")
	public Course insertCoruses(@RequestBody Course course) {
		courseService.saveCourse(course);
		return course;
	}

//	Update 
	@PutMapping("update/{id}")
	public Course updateCourse(@PathVariable int id, @RequestBody Course course) {

//		Course course2 = courseService.getCourseById(id);
//		if (course2 != null) {
//			course2.setName(course2.getName());
//			courseService.saveCourse(course2);
//		}
		return courseService.updateCourse(id, course);
	}
//	Delet

	@DeleteMapping("deletcourse/{id}")
	public void deletCourse(@PathVariable int id) {
		courseService.deletCourseService(id);

	}

}
