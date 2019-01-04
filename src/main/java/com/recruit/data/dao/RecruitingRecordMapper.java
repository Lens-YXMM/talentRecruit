package com.recruit.data.dao;

import com.recruit.data.pojo.RecruitingRecord;

public interface RecruitingRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecruitingRecord record);

    int insertSelective(RecruitingRecord record);

    RecruitingRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecruitingRecord record);

    int updateByPrimaryKey(RecruitingRecord record);
}