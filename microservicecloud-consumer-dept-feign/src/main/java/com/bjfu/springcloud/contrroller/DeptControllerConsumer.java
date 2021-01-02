package com.bjfu.springcloud.contrroller;

import com.bjfu.springcloud.entity.Dept;
import com.bjfu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DeptControllerConsumer {
    @Autowired
    private DeptClientService service;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return service.add(dept);
    }

    @GetMapping("/consumer/dept/get/{deptNo}")
    public Dept get(@PathVariable Integer deptNo) {
        return service.get(deptNo);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list() {
        return service.list();
    }

    @GetMapping("/consumer/dept/discovery")
    public Object discovery() {
        return service.discovery();
    }
}
