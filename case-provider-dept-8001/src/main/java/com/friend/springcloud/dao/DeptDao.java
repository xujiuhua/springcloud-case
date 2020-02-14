package com.friend.springcloud.dao;

import com.friend.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public interface DeptDao {

    List<Dept> selectList();

    Dept selectById(Long id);

    boolean insert(Dept dept);

}
