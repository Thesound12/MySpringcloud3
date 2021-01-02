package com.bjfu.springcloud.service;

import com.bjfu.springcloud.entity.Dept;

import java.util.List;
public interface DeptService {
    boolean add(Dept dept);

    Dept find(Integer deptNo);

    List<Dept> list();
}
