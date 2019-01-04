package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeAward;

public interface ResumeAwardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeAward record);

    int insertSelective(ResumeAward record);

    ResumeAward selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeAward record);

    int updateByPrimaryKey(ResumeAward record);
}