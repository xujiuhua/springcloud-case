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
    public ResponseEntity<Dept> getOne(@PathVariable Long id) {
        Dept dept = deptService.getById(id);
        return ResponseEntity.ok(dept);
    }

    @GetMapping("list")
    public ResponseEntity<List<Dept>> list() {
        List<Dept> list = deptService.list();
        return ResponseEntity.ok(list);
    }

    @PostMapping("save")
    public ResponseEntity<Boolean> save(@RequestBody Dept dept) {
        boolean saveBool = deptService.save(dept);
        return ResponseEntity.ok(saveBool);
    }
}
