package com.utc2.fuochung.QuanLiNhanVien.Repository;

import com.utc2.fuochung.QuanLiNhanVien.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
 List<Employee> findByDepartmentName(String name);
}
