package com.friend.springcloud.controller;

import com.friend.springcloud.entities.Dept;
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

//    private static final String REST_URL = "http://localhost:8001";
    private static final String REST_URL = "http://CASE-DEPT";

    private final RestTemplate restTemplate;

    public DeptController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//    @PostMapping("/dept/save")
//    public ResponseEntity<Boolean> save(Dept dept) {
//        return restTemplate.postForEntity(REST_URL + "/dept/save", dept, Boolean.class);
//    }
//
//    @GetMapping("/dept/list")
//    public ResponseEntity list() {
//        return restTemplate.getForEntity(REST_URL + "/dept/list", List.class);
//    }

    @GetMapping("/dept/{id}")
    public ResponseEntity<Dept> get(@PathVariable Long id) {
        return restTemplate.getForEntity(REST_URL + "/dept/" + id, Dept.class);
    }

}
