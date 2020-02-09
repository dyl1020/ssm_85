package com.itheima.ssm.service;


import com.itheima.ssm.domain.Items;

import java.util.List;

/**
 * @program: ssm_parent
 * @ClassName ItemsService
 * @description:
 * @author: dyl
 * @create: 2020-02-08 19:47
 **/

public interface ItemsService {
    // 查询所有
    List<Items> findAll();
    // 保存
    int save(Items items);
}