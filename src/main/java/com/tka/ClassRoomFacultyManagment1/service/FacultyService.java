package com.tka.ClassRoomFacultyManagment1.service;

import java.util.List;

import com.tka.entity.Faculty;

public interface FacultyService {

	List<Faculty> getAllFaculties();

	Faculty getFacultyById(int id);

	void saveFaculty(Faculty faculty);

	void deleteFaculty(int id);
}
