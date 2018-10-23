package com.codelan.example.EmployeeLab.repositories;

import com.codelan.example.EmployeeLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
