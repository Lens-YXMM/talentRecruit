package com.recruit.data.pojo;

/**
 * @table dictionary_area 地区编码表
 */
public class Area {
    private Integer id;             // 主键id，编码

    private String name;            // 地区名称

    private Integer provinceId;     // 所属省编码，为null时即该条为省级

    private Integer cityId;         // 所属市编码，该条为null时且province_id不为null时即该条为市级

    public Area(Integer id, String name, Integer provinceId, Integer cityId) {
        this.id = id;
        this.name = name;
        this.provinceId = provinceId;
        this.cityId = cityId;
    }

    public Area() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}