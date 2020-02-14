package com.friend.springcloud;

import com.friend.springcloud.entities.Dept;
import com.friend.springcloud.service.DeptService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationTests {

    @Autowired
    private DeptService deptService;

    @Test
    public void testList() {
        List<Dept> list = deptService.list();
        System.out.println(list.size());
    }

    @Test
    public void testFindById() {
        Dept dept = deptService.getById(1L);
        Assert.assertEquals("开发部", dept.getDeptName());
    }

    @Test
    public void tsetSave() {
        Dept dept = new Dept("Hello 张三");
        boolean saveBool = deptService.save(dept);
        Assert.assertTrue(saveBool);
    }


}
