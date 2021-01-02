package com.bjfu.springcloud.service.impl;

import com.bjfu.springcloud.dao.DeptDao;
import com.bjfu.springcloud.entity.Dept;
import com.bjfu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept find(Integer deptNo) {
        return deptDao.findById(deptNo);
    }

    public List<Dept> list() {
        return deptDao.findAll();
    }
}
