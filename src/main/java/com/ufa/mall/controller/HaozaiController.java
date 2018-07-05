package com.ufa.mall.controller;


import com.ufa.mall.entity.Details;
import com.ufa.mall.mapper.DetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.lang.model.element.NestingKind;

@Controller
public class HaozaiController {

    @GetMapping("/haozai")
    public String getHaozai(){
        return "haozai";
    }

 /*   @ResponseBody
    @RequestMapping("/demand")
    public Demand getDemand(int id){
        Demand demand = new Demand();
        demand.setId(1);
        demand.setName("Testin兼容性测试");
        demand.setStatus("云测中");
        demand.setOnlineTime("2018-07-04");
        return demand;
    }*/

    /*@Autowired
    DetailsDao detailsDao;*/

   /* @RequestMapping("/details")
    @ResponseBody
    public Details getDetail(int id){
        Details details = detailsDao.findById(id);
        if(details == null){
            details.setId(9999);
            details.setName("空数据");
            details.setDescription("detail is null");
            return details;
        }
        return details;
    }*/

   @Autowired
    DetailsMapper detailsMapper;

    @ResponseBody
    @RequestMapping("/queryDetail")
    public Details getDetails(int id){
        System.out.println("----------");
        return detailsMapper.queryById(id);
    }

}
