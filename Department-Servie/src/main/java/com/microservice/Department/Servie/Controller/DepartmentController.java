package com.microservice.Department.Servie.Controller;

import com.microservice.Department.Servie.Service.DepartmentService;
import com.microservice.Department.Servie.dto.DepartmentDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;
//    public DepartmentController(DepartmentService departmentService) {
//        this.departmentService = departmentService;
//    }

    //build save rest api
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto departmentDto1 = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(departmentDto1, HttpStatus.CREATED);
    }
@GetMapping("/{code}")
    public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable String code){
       DepartmentDto departmentDto= departmentService.getDepartmentByCode(code);
        return new ResponseEntity<>(departmentDto,HttpStatus.OK);
    }


}
