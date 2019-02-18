package com.jk.controller;

import com.jk.bean.ComBean;
import com.jk.bean.Zc;
import com.jk.service.ExcomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("excom")
@Controller
public class ExcomController {

    @Autowired
    private ExcomService excomService;

    @ResponseBody
    @RequestMapping("queryZc")
    public List<Zc> queryZc(){
        return excomService.queryZc();
    }
    @ResponseBody
    @RequestMapping("addZc")
    public void addZc(Zc zc){
        excomService.addZc(zc);
    }
    @ResponseBody
    @RequestMapping("delZc")
    public void delZc(Integer id){
        excomService.delZc(id);
    }
    @ResponseBody
    @RequestMapping("delCom")
    public void delCom(Integer id){
        excomService.delCom(id);
    }
    @ResponseBody
    @RequestMapping("queryCom")
    public List<ComBean> queryCom(){
        return excomService.queryCom();
    }
    @ResponseBody
    @RequestMapping("updateCom")
    public void updateCom(Integer id){
        excomService.updateCom(id);
    }
}
