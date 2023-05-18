package com.utc2.fuochung.QuanLiNhanVien.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
//    @ManyToOne
//    @JoinColumn(name="employee_id")
//    private Employee employee;

    @OneToOne(mappedBy="department")
    private Employee employee;



}
