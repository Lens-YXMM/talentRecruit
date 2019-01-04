package com.recruit.data.dao;

import com.recruit.data.pojo.School;

import java.util.List;

public interface SchoolMapper {
    /**
     * 模糊查询学校名列表
     * @param keyword 关键字
     * @return List<School> 包含id和学校名的列表
     */
    List<School> selectByKeyword(String keyword);
}