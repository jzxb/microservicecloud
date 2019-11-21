package org.lhx.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.lhx.springcloud.entities.Dept;

import java.util.List;

/**
 * @author lhx
 * @PackageName: org.lhx.springcloud.dao
 * @ClassName: DeptDao
 * @date 2019/11/14 10:42
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
