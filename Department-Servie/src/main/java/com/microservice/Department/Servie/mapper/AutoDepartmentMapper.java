package com.microservice.Department.Servie.mapper;

import com.microservice.Department.Servie.Entity.Department;
import com.microservice.Department.Servie.dto.DepartmentDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AutoDepartmentMapper {
    AutoDepartmentMapper MAPPER= Mappers.getMapper(AutoDepartmentMapper.class);
    DepartmentDto mapToDepartmentDto(Department department);

    Department mapToDepartment(DepartmentDto departmentDto);

}
