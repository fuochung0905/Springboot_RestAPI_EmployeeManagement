package com.utc2.fuochung.QuanLiNhanVien.Service;

import com.utc2.fuochung.QuanLiNhanVien.Model.Employee;
import com.utc2.fuochung.QuanLiNhanVien.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImple implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getString(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        }
        throw new RuntimeException("Employee is not found for the id");
    }

    @Override
    public Employee save(Employee e) {
        return employeeRepository.save(e);
    }

    @Override
    public List<Employee> getEmployeeByDepartment(String name) {
        return  employeeRepository.findByDepartmentName(name);
    }

}

