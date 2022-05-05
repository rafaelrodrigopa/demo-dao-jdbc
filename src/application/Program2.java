package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("=== Teste 01: department findId");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(1);
		System.out.println(department);
		

		System.out.println("\n=== Teste 02: department findAll");
		List<Department> list = new ArrayList<>();
		
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 03: department insert");
		Department dp = new Department(null, "Glasses");
		departmentDao.insert(dp);
		System.out.println(dp.getId());
		System.out.println("Insert completed");
		
		System.out.println("\n=== Teste 04: department update");
		Department dpUp = new Department(10, "Courses");
		departmentDao.update(dpUp);
		System.out.println("Update completed");
		
		System.out.println("\n=== Teste 05: department delete");
		
		for(int i = 13; i <= 15; i++) {
			departmentDao.deleteById(i);
		}
		
		System.out.println("Delete completed");
		
	}

}
