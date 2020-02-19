package com.friend.springcloud.controller;

import com.friend.springcloud.entities.Dept;
import com.friend.springcloud.service.DeptService;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("{id}")
    public Dept getOne(@PathVariable Long id) {
        return deptService.getById(id);
    }

    @GetMapping("list")
    public List<Dept> list() {
        List<Dept> list = deptService.list();
        return list;
    }

    @PostMapping("save")
    public Boolean save(@RequestBody Dept dept) {
       return deptService.save(dept);
    }
}
