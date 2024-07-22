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

import com.tka.entity.Classroom;
import com.tka.service.ClassroomService;

@RestController
@RequestMapping("/classrooms")
public class ClassRoomController {

		@Autowired
		ClassroomService classroomService;

//		Get all classrooms. api 
		@GetMapping("/fetchAllClassrom")
		public List<String> fetchAllClassrom() {
			System.err.println("in getAllClassroom ");
			return classroomService.fetchAllClassrom();
		}

//		Get a specific classroom by ID.
		@GetMapping("/fetchclassroombyID/{id}")
		public List<String> fetchclassroombyId(@PathVariable int id) {
			System.out.println("ID: " + id);

			return classroomService.fetchclassroombyId(id);
		}

//		Insert Data
		@PostMapping("/insertclassroom")
		public void allclassroomdata(@RequestBody Classroom classroom) {
			System.out.println(classroom);
			classroomService.allclassroomData(classroom);
		}

//		Update an existing classroom

		@PutMapping("/updateclassroomdata")
		public void updateClassroom(@RequestBody Classroom classroom) {
			System.out.println(classroom);
			classroomService.updateClassroom(classroom);
		}

	// Delet Data 

		@DeleteMapping("/deleteclassroom/{id}")
		public void deletClassroom(@PathVariable int id) {
			System.out.println(id);
			classroomService.deletclassroomser(id);
			System.out.println("Data Delet");
		}
	}



