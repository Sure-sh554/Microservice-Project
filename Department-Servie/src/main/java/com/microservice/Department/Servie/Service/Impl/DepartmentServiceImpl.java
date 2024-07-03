package com.microservice.Department.Servie.Service.Impl;

import com.microservice.Department.Servie.Entity.Department;
import com.microservice.Department.Servie.Repository.DepartmentRepository;
import com.microservice.Department.Servie.Service.DepartmentService;
import com.microservice.Department.Servie.dto.DepartmentDto;
import com.microservice.Department.Servie.mapper.AutoDepartmentMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;
    private ModelMapper modelMapper;

//    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
//        this.departmentRepository = departmentRepository;
//    }

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        //Convert department dto into department Jpa entity
//        Department department = new Department(
//                departmentDto.getId(),
//                departmentDto.getDepartmentName(),
//                departmentDto.getDepartmentDescription(),
//                departmentDto.getDepartmentCode()
//        );
//        Department department = modelMapper.map(departmentDto, Department.class);
        Department department = AutoDepartmentMapper.MAPPER.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);
//        DepartmentDto savedDepartmentDto = new DepartmentDto(
//                savedDepartment.getId(),
//                savedDepartment.getDepartmentName(),
//                savedDepartment.getDepartmentDescription(),
//                savedDepartment.getDepartmentCode()
//
//        );
//        DepartmentDto savedDepartmentDto = modelMapper.map(savedDepartment, DepartmentDto.class);
        DepartmentDto savedDepartmentDto = AutoDepartmentMapper.MAPPER.mapToDepartmentDto(savedDepartment);

        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
//        DepartmentDto departmentDto = new DepartmentDto(
//                department.getId(),
//                department.getDepartmentName(),
//                department.getDepartmentDescription(),
//                department.getDepartmentCode()
//        );
//        return modelMapper.map(department, DepartmentDto.class);
        return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(department);

    }
}
