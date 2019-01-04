package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeSkill;

public interface ResumeSkillMapper {
    /**
     * 删除技能
     * @param id 简历技能id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增技能
     * @param record 技能
     * @return 影响行数
     */
    int insert(ResumeSkill record);

    //int insertSelective(ResumeSkill record);

    ResumeSkill selectByPrimaryKey(Integer id);

    /**
     * 更新技能
     * @param record 技能
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(ResumeSkill record);

    //int updateByPrimaryKey(ResumeSkill record);

    /**
     * 查询技能列表
     * @param resumeId 简历id
     * @return List<ResumeSkill>
     */
    ResumeSkill selectByResumeId(Integer resumeId);
}