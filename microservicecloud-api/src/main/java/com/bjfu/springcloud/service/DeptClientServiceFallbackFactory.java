package com.bjfu.springcloud.service;

import com.bjfu.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            public boolean add(Dept dept) {
                return false;
            }

            public Dept get(Integer deptNo) {
                Dept dept = new Dept();
                dept.setDeptNo(deptNo);
                dept.setDeptName(deptNo + " 没有对应的信息，Comsumer提供的降级信息");
                dept.setDbSource("no this database in mysql");
                return dept;
            }

            public List<Dept> list() {
                return null;
            }

            public Object discovery() {
                return null;
            }
        };
    }
}
