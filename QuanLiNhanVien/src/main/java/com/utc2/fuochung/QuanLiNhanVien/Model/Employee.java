package com.utc2.fuochung.QuanLiNhanVien.Model;

import com.utc2.fuochung.QuanLiNhanVien.request.EmployeeRequest;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString

@Entity
@Table(name="employee")
@NoArgsConstructor

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @JoinColumn(name="department_id")
    @OneToOne
    private Department department;
    public Employee(EmployeeRequest req){
    this.name=req.getName();
    }


}
