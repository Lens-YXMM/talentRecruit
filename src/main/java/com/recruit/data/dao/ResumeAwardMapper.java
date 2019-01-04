package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeAward;

import java.util.List;

public interface ResumeAwardMapper {
    /**
     * 删除所获奖项
     * @param id 所获奖项id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增所获奖项
     * @param record 所获奖项
     * @return 影响行数
     */
    int insert(ResumeAward record);

    //int insertSelective(ResumeAward record);

    ResumeAward selectByPrimaryKey(Integer id);

    /**
     * 新增所获奖项
     * @param record 所获奖项
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(ResumeAward record);

    //int updateByPrimaryKey(ResumeAward record);

    /**
     * 查询所获奖项列表
     * @param resumeId 简历id
     * @return List<ResumeAward>
     */
    List<ResumeAward> selectByResumeId(Integer resumeId);
}