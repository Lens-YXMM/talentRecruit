package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeJobPreferrance;

public interface ResumeJobPreferranceMapper {
    /**
     * 删除工作意向
     * @param id 工作意向id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增工作意向
     * @param record 工作意向
     * @return 影响行数
     */
    int insert(ResumeJobPreferrance record);

    //int insertSelective(ResumeJobPreferrance record);

    ResumeJobPreferrance selectByPrimaryKey(Integer id);

    /**
     * 更新工作意向
     * @param record 工作意向
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(ResumeJobPreferrance record);

    //int updateByPrimaryKey(ResumeJobPreferrance record);

    /**
     * 查询工作意向
     * @param resumeId 简历id
     * @return ResumeJobPreferrance
     */
    ResumeJobPreferrance selectByResumeId(Integer resumeId);
}