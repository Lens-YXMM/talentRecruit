package com.recruit.data.dao;

import com.recruit.data.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    //int deleteByPrimaryKey(Integer id);

    //int insert(Employee record);

    /**
     * 新增员工信息
     * @param record 员工信息
     * @return 影响行数
     */
    int insertSelective(Employee record);

    /**
     * 根据员工id查找员工信息
     * @param id 员工id
     * @return Employee 员工类实例对象
     */
    Employee selectByPrimaryKey(Integer id);

    /**
     * 更新员工信息
     * @param record 员工信息
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(Employee record);

    //int updateByPrimaryKey(Employee record);

    /**
     * HR查询当前他所在地区的所在部门的所有员工信息列表
     * @param location HR所在地区（市）
     * @param deptId HR所在部门
     * @return List<Employee> 员工类实例对象列表
     */
    List<Employee> selectByLocationAndDeptId(@Param("location")Integer location, @Param("deptId")Integer deptId);
}