package com.recruit.data.dao;

import com.recruit.data.pojo.RecruitingRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitingRecordMapper {
    //int deleteByPrimaryKey(Integer id);

    //int insert(RecruitingRecord record);

    /**
     * 新增应聘过程记录（用户向指定职位投递简历）
     * @param record 应聘过程记录
     * @return 影响行数
     */
    int insertSelective(RecruitingRecord record);

    /**
     * 查询应聘过程记录
     * @param id 应聘过程记录表id
     * @return RecruitingRecord 应聘过程记录id
     */
    RecruitingRecord selectByPrimaryKey(Integer id);

    /**
     * HR更新应聘过程记录
     * @param record 应聘过程记录
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(RecruitingRecord record);

    int updateByPrimaryKey(RecruitingRecord record);

    /**
     * HR查询当前他所在地区的所在部门的所有求职者列表
     * @param location HR所在地区（市）
     * @param deptId HR所在部门
     * @return List<RecruitingRecord> 应聘过程记录类实例对象列表
     */
    List<RecruitingRecord> selectByLocationAndDeptId(@Param("location")Integer location, @Param("deptId")Integer deptId);


    /**
     * 通过用户id获取应聘职位列表
     * @param userId 用户id
     * @return List<RecruitingRecord> 应聘过程记录类实例对象列表
     */
    List<RecruitingRecord> selectByUserId(Integer userId);

}