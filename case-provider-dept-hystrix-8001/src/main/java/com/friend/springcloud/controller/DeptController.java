package com.friend.springcloud.controller;

import com.friend.springcloud.entities.Dept;
import com.friend.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */

@RestController
@RequestMapping("dept")
public class DeptController {

    private final DeptService deptService;

    public DeptController(DeptService deptService) {
        this.deptService = deptService;
    }

    @HystrixCommand(fallbackMethod = "processHystrixGet")
    @GetMapping("{id}")
    public Dept getOne(@PathVariable Long id) {
        Dept dept = deptService.getById(id);
        if (null == dept) {
            throw new RuntimeException();
        }
        return deptService.getById(id);
    }

    public Dept processHystrixGet(@PathVariable(value = "id") Long id) {
        return new Dept().setDeptNo(id)
                .setDeptName("该id:" + id + "没有对应的信息")
                .setDbSource("No this record in database");
    }

}

