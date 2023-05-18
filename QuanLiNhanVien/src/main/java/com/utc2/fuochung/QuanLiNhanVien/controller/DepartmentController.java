package com.utc2.fuochung.QuanLiNhanVien.controller;

import com.utc2.fuochung.QuanLiNhanVien.Model.Department;
import com.utc2.fuochung.QuanLiNhanVien.Repository.DepartmentRepository;
import com.utc2.fuochung.QuanLiNhanVien.Response.DepartmentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;
    @GetMapping("/department")
    public List<DepartmentResponse> getDepartments(){
         List<Department> dpts=departmentRepository.findAll();
         List<DepartmentResponse> list = new ArrayList<>();
        dpts.forEach(d -> {
            DepartmentResponse departmentResponse = new DepartmentResponse();
            departmentResponse.setDepartmentName(d.getName());
            departmentResponse.setId(d.getId());
            departmentResponse.setEmployeeName(d.getEmployee().getName());
            list.add(departmentResponse);
        });
        return list;
    }
}
