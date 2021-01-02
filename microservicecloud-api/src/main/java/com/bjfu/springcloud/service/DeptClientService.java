package com.bjfu.springcloud.service;

import com.bjfu.springcloud.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@FeignClient("MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping("/dept/add")
    boolean add(Dept dept);

    @GetMapping("/dept/get/{deptNo}")
    Dept get(@PathVariable("deptNo") Integer deptNo);

    @GetMapping("/dept/list")
    List<Dept> list();

    @GetMapping("/dept/discovery")
    Object discovery();
}
