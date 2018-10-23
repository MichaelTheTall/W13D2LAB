package com.codelan.example.EmployeeLab.repositories;

import com.codelan.example.EmployeeLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
