package com.friend.springcloud.controller;

import com.friend.springcloud.entities.Dept;
import com.friend.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
@RequestMapping("consumer")
public class DeptController {

    private final DeptClientService service;

    public DeptController(DeptClientService service) {
        this.service = service;
    }

    @PostMapping("/dept/save")
    public ResponseEntity<Boolean> save(Dept dept) {
        Boolean saveBool = this.service.save(dept);
        return ResponseEntity.ok(saveBool);
    }

    @GetMapping("/dept/list")
    public ResponseEntity list() {
        List<Dept> list = this.service.list();
        return  ResponseEntity.ok(list);
    }

    @GetMapping("/dept/{id}")
    public ResponseEntity<Dept> get(@PathVariable(value = "id") Long id) {
        Dept dept = this.service.get(id);
        return ResponseEntity.ok(dept);
    }

}
