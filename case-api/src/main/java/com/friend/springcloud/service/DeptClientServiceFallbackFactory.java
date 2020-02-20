package com.friend.springcloud.service;

import com.friend.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Boolean save(Dept dept) {
                return null;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptNo(id)
                        .setDeptName("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDbSource("no this database in MySQL");
            }
        };
    }
}
