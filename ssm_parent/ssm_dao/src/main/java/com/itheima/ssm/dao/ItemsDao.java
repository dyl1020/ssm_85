package com.itheima.ssm.dao;


import com.itheima.ssm.domain.Items;

import java.util.List;

/**
 * @program: ssm_parent
 * @ClassName ItemsDao
 * @description:
 * @author: dyl
 * @create: 2020-02-08 18:57
 **/

public interface ItemsDao {
    //查询所有
    List<Items> findAll();
    //保存
    int save(Items items);
}