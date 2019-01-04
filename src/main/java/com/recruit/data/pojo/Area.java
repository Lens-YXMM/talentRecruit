package com.recruit.data.pojo;

public class Area {
    private Integer id;

    private String name;

    private Integer provinceId;

    private Integer cityId;

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