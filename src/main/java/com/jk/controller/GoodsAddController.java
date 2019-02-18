package com.jk.controller;

import com.jk.bean.GoodsInfo;
import com.jk.service.GoodsService;
import com.jk.utils.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("GoodsInfoAdd")
public class GoodsAddController {
    @Resource
    private GoodsService goodsService;
    //查询一类商品
    @ResponseBody
    @RequestMapping("queryGoods")
    public List queryGoods(){

        return goodsService.queryGoods();
    }
    //查询二类商品
    @ResponseBody
    @RequestMapping("querySecondGoods")
    public List querySecondGoods(Integer id){

        return goodsService.querySecondGoods(id);
    }
    @ResponseBody
    @RequestMapping("addGoods")
    public String addGoods(GoodsInfo goodsInfo){
        goodsService.addGoods(goodsInfo);
        return "1";
    }
    @ResponseBody
    @RequestMapping("addImg")
    public String addImg(MultipartFile imgfile, HttpServletRequest request){
        String imgfile1 = FileUtil.upload(imgfile, request);

        try {
            Thread.sleep(1000); //1000 毫秒，也就是1秒.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        return imgfile1;
    }
}

