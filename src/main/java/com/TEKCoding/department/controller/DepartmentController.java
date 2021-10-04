package com.TEKCoding.department.controller;

import com.TEKCoding.department.entity.Department;
import com.TEKCoding.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/Departments")

@Slf4j // lombok

public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment( @RequestBody Department department){

        return departmentService.saveDepartment(department); // Shortcut key: Alt + Enter
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.findDepartmentById(departmentId);
    }
}
