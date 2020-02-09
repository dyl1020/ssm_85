package com.itheima.web.controller;

import com.itheima.ssm.domain.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: ssm_parent
 * @ClassName ItemsController
 * @description:
 * @author: dyl
 * @create: 2020-02-09 01:13
 **/

@Controller
@RequestMapping
public class ItemsController {

    @Autowired
    ItemsService itemsService;

    //查询
    @RequestMapping(value = "/list")
    public String findAll(Model model) {
        List<Items> list = itemsService.findAll();
        model.addAttribute("items", list);
        return "items";
    }

    //保存
    public String save(Items items){
        int rows = itemsService.save(items);
        // 保存成功
        if(rows>0){
            System.out.println("保存成功");
        }
        return "redirect:/items/list";
    }

}