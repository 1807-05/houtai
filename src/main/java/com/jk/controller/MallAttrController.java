package com.jk.controller;

import com.jk.bean.MallAttr;
import com.jk.bean.MallValue;
import com.jk.service.MallAttrService;
import com.jk.utils.ReceivePage;
import com.jk.utils.SendPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("attr")
public class MallAttrController {



            @Autowired
            MallAttrService  mallAttrService;


            @ResponseBody
            @RequestMapping("queryMallAttr")
            public SendPage queryMallAttr(ReceivePage rp, MallAttr mallAttr){

                return mallAttrService.queryMallAttr(rp, mallAttr);
            }
            @ResponseBody
            @RequestMapping("getmch")
            public List getmch(@RequestBody Integer id){
            MallAttr mallAttr=new MallAttr();
            mallAttr.setVid(id);
                return mallAttrService.getmch(mallAttr);
            }


            @ResponseBody
            @RequestMapping("addAttr")
            public void addAttr(MallValue mallValue){
                mallAttrService.addAttr(mallValue);
            }


}
