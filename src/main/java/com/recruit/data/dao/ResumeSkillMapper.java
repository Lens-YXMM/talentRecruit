package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeSkill;

public interface ResumeSkillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeSkill record);

    int insertSelective(ResumeSkill record);

    ResumeSkill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeSkill record);

    int updateByPrimaryKey(ResumeSkill record);
}