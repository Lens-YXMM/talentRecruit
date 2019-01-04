package com.recruit.data.dao;

import com.recruit.data.pojo.Job;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobMapper {
    //int deleteByPrimaryKey(Integer id);

    //int insert(Job record);

    /**
     * 新增职位信息
     * @param record 职位信息
     * @return 影响行数
     */
    int insertSelective(Job record);

    /**
     * 通过主键查询职位信息
     * @param id 职位id
     * @return  Job 职位类实例对象
     */
    Job selectByPrimaryKey(Integer id);

    /**
     * 更新职位信息
     * @param record 职位信息
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(Job record);

    //int updateByPrimaryKey(Job record);

    /**
     * 条件查询职位列表
     * @param categoryIdList 分类id列表
     * @param location 地区（市）编码
     * @param deptId 部门id
     * @param keyword 关键字
     * @return
     */
    List<Job> selectByParams(@Param("categoryIdList")List<Integer> categoryIdList, @Param("location")Integer location , @Param("deptId")Integer deptId, @Param("keyword")String keyword);


}