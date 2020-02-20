package com.friend.springcloud.service.impl;

import com.friend.springcloud.dao.DeptDao;
import com.friend.springcloud.entities.Dept;
import com.friend.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@Service
public class DeptServiceImpl implements DeptService {

    private final DeptDao deptDao;

    public DeptServiceImpl(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public List<Dept> list() {
        return deptDao.selectList();
    }

    @Override
    public Dept getById(long id) {
        return deptDao.selectById(id);
    }

    @Override
    public boolean save(Dept dept) {
        return deptDao.insert(dept);
    }
}
