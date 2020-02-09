package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsDao {
    //查询所有
    List<Items> findAll();

    //保存
    int save(Items items);
}
