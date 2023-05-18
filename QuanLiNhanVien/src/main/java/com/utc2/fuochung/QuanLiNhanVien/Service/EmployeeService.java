package com.utc2.fuochung.QuanLiNhanVien.Service;

import com.utc2.fuochung.QuanLiNhanVien.Model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployee() ;
    Employee getString(Long id);
    Employee save(Employee e);
    List<Employee> getEmployeeByDepartment(String name);
}
