package com.recruit.data.dao;

import com.recruit.data.pojo.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaMapper {
    /**
     * 通过编码查询地区字段信息
     * @param id 地区编码
     * @return Area 地区类
     */
    Area selectByPrimaryKey(Integer id);

    // 下面两个方法仅用于表达如何生成城市级联三层树的结构，实际应该用不到
    /**
     * 根据省份id字段获取该省份下城市列表
     * @param provinceId 省份id
     * @return 列表包含id、name，provinceId为空时返回的列表为省份，否则为该省份下城市列表
     */
    //List<Area> selectCityByProvinceId(Integer provinceId);

    /**
     * 根据城市id字段获取该省份下城市列表
     * @param cityId 城市id
     * @return 列表包含id、name（名称），cityId为空时返回的列表为城市，否则为该城市下地区列表
     */
    //List<Area> selectDistrictByCityId(Integer cityId);
}