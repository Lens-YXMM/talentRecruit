package com.recruit.data.dao;

import com.recruit.data.pojo.ResumeLanguage;

import java.util.List;

public interface ResumeLanguageMapper {
    /**
     * 删除语言
     * @param id 语言id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增语言
     * @param record 语言
     * @return 影响行数
     */
    int insert(ResumeLanguage record);

    //int insertSelective(ResumeLanguage record);

    ResumeLanguage selectByPrimaryKey(Integer id);

    /**
     * 更新语言
     * @param record 语言
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(ResumeLanguage record);

    //int updateByPrimaryKey(ResumeLanguage record);

    /**
     * 查询语言列表
     * @param resumeId 简历id
     * @return List<ResumeLanguage>
     */
    List<ResumeLanguage> selectByResumeId(Integer resumeId);
}