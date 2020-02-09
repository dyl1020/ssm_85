package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.ItemsDao;
import com.itheima.ssm.domain.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: ssm_parent
 * @ClassName ItemsServiceImpl
 * @description:
 * @author: dyl
 * @create: 2020-02-08 19:50
 **/
@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    ItemsDao itemsDao;

    public List<Items> findAll() {
//        List<Items> list = itemsDao.findAll();
        List<Items> list = itemsDao.findAll();
        return null;
    }

    public int save(Items items) {
        int save = itemsDao.save(items);
        return 0;
    }

//    public int save(Items items) {
//        int rows = itemsDao.save(items);
//        return rows;
//    }
}