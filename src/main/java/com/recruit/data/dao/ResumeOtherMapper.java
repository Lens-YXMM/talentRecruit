package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeOther;

public interface ResumeOtherMapper {
    /**
     * 删除自定义信息
     * @param id 自定义信息id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增自定义信息
     * @param record 自定义信息
     * @return 影响行数
     */
    int insert(ResumeOther record);

    //int insertSelective(ResumeOther record);

    ResumeOther selectByPrimaryKey(Integer id);

    /**
     * 更新自定义信息
     * @param record 自定义信息
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(ResumeOther record);

    //int updateByPrimaryKey(ResumeOther record);

    /**
     * 查询自定义信息
     * @param resumeId 简历id
     * @return ResumeOther
     */
    ResumeOther selectByResumeId(Integer resumeId);
}