package com.utc2.fuochung.QuanLiNhanVien.Service;

import com.utc2.fuochung.QuanLiNhanVien.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentImple implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;


}
