package com.friend.springcloud.service;

import com.friend.springcloud.entities.Dept;

import java.util.List;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public interface DeptService {

    List<Dept> list();

    Dept getById(long l);

    boolean save(Dept dept);
}
