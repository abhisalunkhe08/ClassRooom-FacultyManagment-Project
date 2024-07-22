package com.tka.ClassRoomFacultyManagment1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.DepartmnetDao;
import com.tka.entity.Department;

@Service
public class DepartmnetService {

	@Autowired
	DepartmnetDao departmnetDao;

	public List<String> getalldeparments() {
		List<Department> fetchcoursessall = departmnetDao.getalldeparments();
		ArrayList<String> listcourse = new ArrayList<>();

		for (Department department : fetchcoursessall) {
			listcourse.add(department.getName());
		}
		return listcourse;
	}

	public void saveDepartment(Department department) {
		departmnetDao.saveDao(department);

	}

	public Department getdepartmentById(int id) {

		return departmnetDao.getdepartmentById(id);
	}

//	Update
	public Department updateDepartment(int id, Department departmentDetails) {
		Department department = getdepartmentById(id);
		if (department != null) {
			department.setName(departmentDetails.getName());
		}
		return departmnetDao.updatecourse(department);

	}

}
