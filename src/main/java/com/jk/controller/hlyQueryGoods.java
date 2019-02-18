package com.jk.controller;

import com.jk.bean.GoodsComment;
import com.jk.bean.GoodsInfo;
import com.jk.bean.Website;
import com.jk.service.QueryGoodsService;
import com.jk.utils.ExportExcel;
import com.jk.utils.ReceivePage;
import com.jk.utils.SendPage;
import com.jk.utils.importExcel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("goods")
public class hlyQueryGoods {

        @Resource
        private QueryGoodsService queryGoodsService;

        @ResponseBody
        @RequestMapping("queryAllGoods")
        private SendPage queryAllGoods(GoodsInfo goods, ReceivePage page){
            SendPage sp=queryGoodsService.queryAllGoods(goods,page);
            return sp;
        }

        @ResponseBody
        @RequestMapping("deleteOneGoods")
        public  String  deleteOneGoods(String  id){
            queryGoodsService.deleteOneGoods(id);
            return  "1";
        }

        @ResponseBody
        @RequestMapping("queryGoodsComment")
        public List queryGoodsComment(@RequestBody GoodsComment  comment){
            List st =queryGoodsService.queryGoodsComment(comment);


            return st;
        }
    @ResponseBody
    @RequestMapping("querytite")
    public SendPage querytite(ReceivePage page){
        SendPage sp=queryGoodsService.querytite(page);
        return sp;
    }
    @ResponseBody
    @RequestMapping("deletegoodtite")
    public String deletegoodtite(String id){
        queryGoodsService.deletegoodtite(id);
        return " ";
    }
    @ResponseBody
    @RequestMapping("goodtiteadd")
    public  String goodtiteadd(Website website){
        queryGoodsService.goodstiteadd(website);

        return "";
    }
    @ResponseBody
    @RequestMapping("updategoods")
    public  Website updategoods(String id){
        Website webs=queryGoodsService.updategoods(id);

        return webs;
    }
    @RequestMapping("daochu")
    @ResponseBody
   public String daochu(String ids) throws IOException {
     List list=queryGoodsService.queryids(ids);
      FileSystemView fsv = FileSystemView.getFileSystemView();
      File com = fsv.getHomeDirectory();
        String cpath = com.getPath();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
        String format = simpleDateFormat.format(new Date());
        //--------------=.=.-.-.=.=.=.-.-=.=-.=.-=.=.=.=-.=
        String sheetName="商品列表";
        String titleName="我的列表";
        String[] headers = { "id", "标题","路径"};
         String resultUrl=cpath+"\\"+format+".xls";
        String pattern="yyyy-MM-dd";
        ExportExcel.exportExcel(sheetName, titleName, headers, list, resultUrl, pattern);
        return "success";
    }
    @ResponseBody
    @RequestMapping("importExcel")
    public String importExcel() throws Exception{
        String originUrl="C:\\Users\\鲍正阳\\Desktop\\2019-01-25-204253.xls";
        int startRow=2;
        int endRow=0;
        List<Website> bookList =(List<Website>) importExcel.importExcel(originUrl, startRow, endRow, Website.class);
        for ( Website website : bookList) {
            website.setId(null);
            queryGoodsService.goodstiteadd(website);
        }
        return "1";
    }


    @ResponseBody
    @RequestMapping("importss")
    public Integer importss(MultipartFile fill,HttpServletRequest request) throws Exception{
        String name = fill.getOriginalFilename();
        System.out.println(name);
        String[] split = name.split("\\.");
        String s = split[split.length - 1];
        if(s.equals("xls")){
            FileSystemView fsv = FileSystemView.getFileSystemView();
            File com = fsv.getHomeDirectory();
            String cpath = com.getPath();
            String originUrl=cpath+"\\"+name;
            int startRow=2;
            int endRow=0;
            List<Website> bookList =(List<Website>) importExcel.importExcel(originUrl, startRow, endRow, Website.class);
            for ( Website website : bookList) {
                website.setId(null);
                queryGoodsService.goodstiteadd(website);
            }
            return 2;
        }


        return 1;
    }

}
