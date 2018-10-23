package com.codelan.example.EmployeeLab;

import com.codelan.example.EmployeeLab.models.Department;
import com.codelan.example.EmployeeLab.models.Employee;
import com.codelan.example.EmployeeLab.models.Project;
import com.codelan.example.EmployeeLab.repositories.DepartmentRepository;
import com.codelan.example.EmployeeLab.repositories.EmployeeRepository;
import com.codelan.example.EmployeeLab.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department1 = new Department("Sales");
		departmentRepository.save(department1);

		Employee bob = new Employee("Bob", "Boberton", department1);
		Employee alice = new Employee("Alice", "Ericsdottir", department1);
		employeeRepository.save(bob);
		employeeRepository.save(alice);
	}

	@Test
	public void addEmployeesAndProjects(){
		Department department2 = new Department("Accounts");
		departmentRepository.save(department2);

		Employee carl = new Employee("Carl", "Carlson", department2);
		Employee derek = new Employee("Derek", "Ericsson", department2);
		employeeRepository.save(carl);
		employeeRepository.save(derek);

		Project project1 = new Project("HAMMERFALL", 10);
		projectRepository.save(project1);

		project1.addEmployee(carl);
		project1.addEmployee(derek);
		projectRepository.save(project1);

	}


}
