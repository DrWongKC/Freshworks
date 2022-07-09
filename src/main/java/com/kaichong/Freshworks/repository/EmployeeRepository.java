package com.kaichong.Freshworks.repository;

import com.kaichong.Freshworks.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
    // Tutorial site: https://www.javaguides.net/2021/10/spring-boot-crud-rest-api-project-using-IntelliJ-IDEA.html
}