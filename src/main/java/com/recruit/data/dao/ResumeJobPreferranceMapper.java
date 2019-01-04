package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeJobPreferrance;

public interface ResumeJobPreferranceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeJobPreferrance record);

    int insertSelective(ResumeJobPreferrance record);

    ResumeJobPreferrance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeJobPreferrance record);

    int updateByPrimaryKey(ResumeJobPreferrance record);
}