package com.tka.ClassRoomFacultyManagment1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Department;
import com.tka.service.DepartmnetService;

@RestController
@RequestMapping("/department/")
public class DepartmentController {

	@Autowired
	DepartmnetService departmnetService;

	// first api fetch data
	@GetMapping("/department")
	public List<String> getalldeparments() {

		return departmnetService.getalldeparments();
	}

	// Fetch Data by Id
	@GetMapping("/departmnent/{id}")
	public Department getdepartmentById(@PathVariable int id) {
		System.out.println(id);
		return departmnetService.getdepartmentById(id);
	}

// Insert Data 
	@PostMapping("/insertdepartment")
	public Department insertCourse(@RequestBody Department department) {
		departmnetService.saveDepartment(department);
		return department;
	}

	@PutMapping("/{id}")
	public Department updateDepartment(@PathVariable int id, @RequestBody Department departmentDetails) {
		Department department = departmnetService.getdepartmentById(id);
		if (department != null) {
			department.setName(departmentDetails.getName());
			departmnetService.updateDepartment(id, departmentDetails);
		}
		return department;
	}
}
