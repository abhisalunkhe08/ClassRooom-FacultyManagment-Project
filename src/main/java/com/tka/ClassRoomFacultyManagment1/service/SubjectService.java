package com.tka.ClassRoomFacultyManagment1.service;

import java.util.List;

import com.tka.entity.Subject;

public interface SubjectService {
	List<Subject> getAllSubjects();

	Subject getSubjectById(int id);

	void saveSubject(Subject subject);

	void deleteSubject(int id);
}
