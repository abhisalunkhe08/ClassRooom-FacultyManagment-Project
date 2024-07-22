package com.tka.ClassRoomFacultyManagment1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tka.dao.SubjectDAO;
import com.tka.entity.Subject;

@Service
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private SubjectDAO subjectDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Subject> getAllSubjects() {

		return subjectDAO.getAllSubjects();
	}

	@Override
	@Transactional(readOnly = true)
	public Subject getSubjectById(int id) {

		return subjectDAO.getSubjectById(id);
	}

	@Override
	@Transactional
	public void saveSubject(Subject subject) {
		subjectDAO.saveSubject(subject);

	}

	@Override
	@Transactional
	public void deleteSubject(int id) {
		subjectDAO.deleteSubject(id);

	}

}
