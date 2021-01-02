package com.bjfu.springcloud.controller;

import com.bjfu.springcloud.entity.Dept;
import com.bjfu.springcloud.service.DeptService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping("/dept/get/{deptNo}")
    public Dept find(@PathVariable Integer deptNo) {
        return deptService.find(deptNo);
    }

    @GetMapping("/dept/list")
    public List<Dept> find() {
        return deptService.list();
    }

    @GetMapping("/dept/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        System.out.println("*******" + services);
        List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance serviceInstance :
                instances) {
            System.out.println(serviceInstance.getServiceId());
            System.out.println(serviceInstance.getHost());
            System.out.println(serviceInstance.getPort());
            System.out.println(serviceInstance.getUri());
        }
        return this.discoveryClient;
    }
}
