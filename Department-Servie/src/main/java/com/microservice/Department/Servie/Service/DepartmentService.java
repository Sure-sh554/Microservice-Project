package com.microservice.Department.Servie.Service;

import com.microservice.Department.Servie.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(Long code);
}
