package com.recruit.data.dao;

import com.recruit.data.pojo.Category;

import java.util.List;

public interface CategoryMapper {
    //int deleteByPrimaryKey(Integer id);

    //int insert(Category record);

    //int insertSelective(Category record);

    /**
     * 获取职位分类信息
     * @param id 职位分类编码
     * @return Category 职位分类类实例对象
     */
    Category selectByPrimaryKey(Integer id);

    //int updateByPrimaryKeySelective(Category record);

    //int updateByPrimaryKey(Category record);

    /**
     * 通过父id查找职位分类列表
     * @param parentId 父id
     * @return List<Catergory> 职位分类类实例对象列表
     */
    List<Category> selectCategoryChildrenByParentId(Integer parentId);
}