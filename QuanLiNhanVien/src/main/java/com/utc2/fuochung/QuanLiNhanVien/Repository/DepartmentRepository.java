package com.utc2.fuochung.QuanLiNhanVien.Repository;

import com.utc2.fuochung.QuanLiNhanVien.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
