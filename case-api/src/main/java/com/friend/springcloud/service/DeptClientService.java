package com.friend.springcloud.service;

import com.friend.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@FeignClient(value = "CASE-DEPT")
public interface DeptClientService {

    @PostMapping("/dept/save")
    Boolean save(Dept dept);

    @GetMapping("/dept/list")
    List<Dept> list();

    @GetMapping("/dept/{id}")
    Dept get(@PathVariable("id") Long id);

}
