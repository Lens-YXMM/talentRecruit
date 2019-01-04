package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeLanguage;

public interface ResumeLanguageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeLanguage record);

    int insertSelective(ResumeLanguage record);

    ResumeLanguage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeLanguage record);

    int updateByPrimaryKey(ResumeLanguage record);
}