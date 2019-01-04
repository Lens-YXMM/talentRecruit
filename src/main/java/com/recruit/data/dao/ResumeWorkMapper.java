package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeWork;

public interface ResumeWorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeWork record);

    int insertSelective(ResumeWork record);

    ResumeWork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeWork record);

    int updateByPrimaryKey(ResumeWork record);
}