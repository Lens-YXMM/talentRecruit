package com.recruit.data.dao;

import com.recruit.data.pojo.Department;

import java.util.List;

public interface DepartmentMapper {
    //int deleteByPrimaryKey(Integer id);

    //int insert(Department record);

    //int insertSelective(Department record);

    /**
     * 通过主键查找部门信息
     * @param id 部门id
     * @return Department 部门类实例对象
     */
    Department selectByPrimaryKey(Integer id);

    //int updateByPrimaryKeySelective(Department record);

    //int updateByPrimaryKey(Department record);

    /**
     * 根据部门所在地查找部门信息列表
     * @param location 部门所在地（市）
     * @return List<Department> 部门类对象实例列表，查找部门id和名字
     */
    List<Department> selectDepartmentsByLocation(Integer location);
}