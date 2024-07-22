package com.tka.ClassRoomFacultyManagment1.service;

import java.util.List;

import com.tka.entity.ClassSchedule;

public interface ClassScheduleService {
	List<ClassSchedule> getAllClassSchedules();

	ClassSchedule getClassScheduleById(int id);

	void saveClassSchedule(ClassSchedule classSchedule);

	void deleteClassSchedule(int id);
}
