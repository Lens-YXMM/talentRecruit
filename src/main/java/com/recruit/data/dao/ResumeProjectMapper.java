package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeProject;

import java.util.List;

public interface ResumeProjectMapper {
    /**
     * 删除项目经历
     * @param id 项目经历id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    //int insert(ResumeProject record);

    /**
     * 新增项目经历
     * @param record 项目经历
     * @return 影响行数
     */
    int insertSelective(ResumeProject record);

    ResumeProject selectByPrimaryKey(Integer id);

    /**
     * 更新项目经历
     * @param record 项目经历
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(ResumeProject record);

    //int updateByPrimaryKey(ResumeProject record);

    /**
     * 查询项目经历列表
     * @param resumeId 简历id
     * @return List<ResumeProject>
     */
    List<ResumeProject> selectByResumeId(Integer resumeId);
}