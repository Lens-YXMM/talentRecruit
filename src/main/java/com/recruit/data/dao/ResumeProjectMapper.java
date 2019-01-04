package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeProject;

public interface ResumeProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeProject record);

    int insertSelective(ResumeProject record);

    ResumeProject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeProject record);

    int updateByPrimaryKey(ResumeProject record);
}