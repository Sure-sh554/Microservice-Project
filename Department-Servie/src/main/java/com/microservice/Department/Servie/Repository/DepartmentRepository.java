package com.microservice.Department.Servie.Repository;

import com.microservice.Department.Servie.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
