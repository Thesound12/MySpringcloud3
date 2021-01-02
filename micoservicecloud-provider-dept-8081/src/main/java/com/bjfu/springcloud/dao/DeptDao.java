package com.bjfu.springcloud.dao;

import com.bjfu.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Integer deptNo);

    List<Dept> findAll();

}
