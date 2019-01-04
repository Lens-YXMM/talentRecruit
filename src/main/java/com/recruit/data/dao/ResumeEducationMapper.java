package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeEducation;

import java.util.List;

public interface ResumeEducationMapper {
    /**
     * 删除教育经历
     * @param id 教育经历id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增教育经历
     * @param record 教育经历
     * @return 影响行数
     */
    int insert(ResumeEducation record);

    //int insertSelective(ResumeEducation record);

    ResumeEducation selectByPrimaryKey(Integer id);

    /**
     * 更新教育经历
     * @param record 教育经历
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(ResumeEducation record);

    int updateByPrimaryKey(ResumeEducation record);

    /**
     * 查询教育经历列表
     * @param resumeId 简历id
     * @return List<ResumeEducation>
     */
    List<ResumeEducation> selectByResumeId(Integer resumeId);
}