package org.lhx.springcloud.service.impl;

import org.lhx.springcloud.dao.DeptDao;
import org.lhx.springcloud.entities.Dept;
import org.lhx.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhx
 * @PackageName: org.lhx.springcloud.service.impl
 * @ClassName: DeptServiceImpl
 * @date 2019/11/14 10:47
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}
