package com.recruit.data.pojo;

/**
 * @table dictionary_school 学校字典表
 */
public class School {
    private Integer id;     // 主键id

    private String name;    // 学校名称

    private String place;   // 所在省（直辖市）名称

    private String type;    // 学校类型

    private String properties;  // 学校性质，如本科，高职专科，其他

    public School(Integer id, String name, String place, String type, String properties) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.type = type;
        this.properties = properties;
    }

    public School() {
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }
}