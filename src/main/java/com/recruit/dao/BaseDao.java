package com.recruit.dao;

import java.util.List;

public interface BaseDao<T extends Object> {
    public List<T> executeQueryForObject(Object[] obj, String sql);

}
