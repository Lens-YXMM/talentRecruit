package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeWork;

import java.util.List;

public interface ResumeWorkMapper {
    /**
     * 删除工作经历
     * @param id 工作经历id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增工作经历
     * @param record 工作经历
     * @return 影响行数
     */
    int insert(ResumeWork record);

    //int insertSelective(ResumeWork record);

    ResumeWork selectByPrimaryKey(Integer id);

    /**
     * 更新工作经历
     * @param record 工作经历
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(ResumeWork record);

    //int updateByPrimaryKey(ResumeWork record);

    /**
     * 查询工作经历列表
     * @param resumeId 简历id
     * @return List<ResumeWork>
     */
    List<ResumeWork> selectByResumeId(Integer resumeId);
}