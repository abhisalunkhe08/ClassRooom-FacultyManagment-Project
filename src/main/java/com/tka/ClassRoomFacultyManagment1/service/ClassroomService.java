package com.tka.ClassRoomFacultyManagment1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tka.dao.ClassroomDao;
import com.tka.entity.Classroom;

@Component
public class ClassroomService {

	@Autowired
	ClassroomDao classroomDao;

//	fetch data  1st api 
	public List<String> fetchAllClassrom() {
		List<Classroom> classroomslist = classroomDao.allinfoClassroom();
		ArrayList<String> arrayList = new ArrayList<>();
		for (Classroom classroom : classroomslist) {
			arrayList.add(classroom.getName());
		}

		return arrayList;
	}

//	Insert Data
	public void allclassroomData(Classroom classroom) {

		classroomDao.allClassroom(classroom);
	}

// 3rd api
	public List<String> fetchclassroombyId(int id) {
		List<Classroom> classroomslist = classroomDao.allinfoClassroom();
		ArrayList<String> arrayListid = new ArrayList<>();
		for (Classroom classroom : classroomslist) {
			if (classroom.getId() == id) {
				arrayListid.add(classroom.getName());
			}
		}
		return arrayListid;
	}
//	Update CLassroom

	public void updateClassroom(Classroom classroom) {

		classroomDao.updateClassroom(classroom);

	}
//	Delet 

	public void deletclassroomser(int id) {
		classroomDao.deletclassroom(id);

	}

}
