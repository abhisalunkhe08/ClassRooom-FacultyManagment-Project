package com.tka.ClassRoomFacultyManagment1.dao;

import java.util.List;

import com.tka.entity.ClassSchedule;

public interface ClassScheduleDAO {
	List<ClassSchedule> getAllClassSchedules();

	ClassSchedule getClassScheduleById(int id);

	void saveClassSchedule(ClassSchedule classSchedule);

	void deleteClassSchedule(int id);
}
