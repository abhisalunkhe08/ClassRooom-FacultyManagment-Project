package com.tka.ClassRoomFacultyManagment1.dao;

import java.util.List;

import com.tka.entity.Subject;

public interface SubjectDAO {
	List<Subject> getAllSubjects();

	Subject getSubjectById(int id);

	void saveSubject(Subject subject);

	void deleteSubject(int id);
}
