package com.utc2.fuochung.QuanLiNhanVien.controller;

import com.utc2.fuochung.QuanLiNhanVien.Model.Department;
import com.utc2.fuochung.QuanLiNhanVien.Model.Employee;
import com.utc2.fuochung.QuanLiNhanVien.Repository.DepartmentRepository;
import com.utc2.fuochung.QuanLiNhanVien.Repository.EmployeeRepository;
import com.utc2.fuochung.QuanLiNhanVien.Service.EmployeeService;
import com.utc2.fuochung.QuanLiNhanVien.request.EmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping( "/employee")
    public ResponseEntity<List<Employee>> getEmployee(){
        return new ResponseEntity<List<Employee>>(employeeService.getEmployee(), HttpStatus.OK) ;
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee>getEmployee(@PathVariable Long id){
        return new ResponseEntity<Employee>(employeeService.getString(id),HttpStatus.OK);
    }
//    @PostMapping("/employee")
//    public ResponseEntity<String>saveEmployee(@RequestBody EmployeeRequest eReq){
//        Employee epl= new Employee(eReq);
//        employeeRepository.save(epl);
//        for(String s: eReq.getDepartment()){
//            Department d= new Department();
//            d.setName(s);
//            d.setEmployee(epl);
//            departmentRepository.save(d);
//        }
//        return new ResponseEntity<String>("Record save success",HttpStatus.CREATED);
//    }
    @PostMapping("/employee")
    public ResponseEntity<Employee>saveEmployee(@RequestBody EmployeeRequest eReq){
        Department dpm= new Department();
        dpm.setName(eReq.getName());
        departmentRepository.save(dpm);
        Employee employee= new Employee(eReq);
        employee.setDepartment(dpm);
        return new ResponseEntity<Employee>(employeeRepository.save(employee),HttpStatus.CREATED);
    }
    @GetMapping("/employee/filter/{name}")
    public ResponseEntity<List<Employee>>getEmployeeByDepartment(@PathVariable String name){
        return new ResponseEntity<List<Employee>>(employeeService.getEmployeeByDepartment(name),HttpStatus.OK);
    }
}
