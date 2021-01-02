package com.bjfu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    private Integer deptNo;
    private String deptName;
    private String dbSource;
}
