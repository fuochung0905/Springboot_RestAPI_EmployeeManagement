package com.utc2.fuochung.QuanLiNhanVien.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class EmployeeRequest {
    private String name;
    private List<String> department;
}
