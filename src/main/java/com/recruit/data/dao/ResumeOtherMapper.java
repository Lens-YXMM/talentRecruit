package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeOther;

public interface ResumeOtherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeOther record);

    int insertSelective(ResumeOther record);

    ResumeOther selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeOther record);

    int updateByPrimaryKey(ResumeOther record);
}