package com.tka.ClassRoomFacultyManagment1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tka.dao.FacultyDAO;
import com.tka.entity.Faculty;

@Service
public class FacultyServiceImpl implements FacultyService {
	@Autowired
	private FacultyDAO facultyDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Faculty> getAllFaculties() {
		return facultyDAO.getAllFaculties();
	}

	@Override
	@Transactional(readOnly = true)
	public Faculty getFacultyById(int id) {
		return facultyDAO.getFacultyById(id);
	}

	@Override
	@Transactional
	public void saveFaculty(Faculty faculty) {
		facultyDAO.saveFaculty(faculty);

	}

	@Override
	@Transactional
	public void deleteFaculty(int id) {
		facultyDAO.deleteFaculty(id);

	}

}
