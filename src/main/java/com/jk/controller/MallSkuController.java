package com.jk.controller;

import com.jk.bean.Addmsmsav;
import com.jk.service.MallSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("sku")
public class MallSkuController {
    @Autowired
    MallSkuService mallSkuService;
    @ResponseBody
    @RequestMapping("getchecked")
    public List getchecked(Integer id){
        return mallSkuService.getchecked(id);
    }
    @ResponseBody
    @RequestMapping("getprodbyid")
    public List getprodbyid(Integer id){
        return mallSkuService.getprodbyid(id);
    }
    @ResponseBody
    @RequestMapping("querythis")
    public List querythis(Integer ids){
        return mallSkuService.querythis(ids);
    }
    @ResponseBody
    @RequestMapping("addsku")
    public void addsku(Addmsmsav addmsmsav){
        mallSkuService.addsku(addmsmsav);
    }
}
