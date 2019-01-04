package com.recruit.data.dao;

import com.recruit.data.pojo.Resume;

public interface ResumeMapper {
    //int deleteByPrimaryKey(Integer id);

    /**
     * 新增简历基本信息
     * @param record 简历基本信息
     * @return 影响行数
     */
    int insert(Resume record);

    //int insertSelective(Resume record);

    Resume selectByPrimaryKey(Integer id);

    /**
     * 更新简历基本信息
     * @param record 简历基本信息
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(Resume record);

    //int updateByPrimaryKey(Resume record);

    /**
     * 通过userId查询简历信息
     * @param userId 用户id
     * @return Resume 简历类实例对象
     */
    Resume selectByUserId(Integer userId);

}