package com.jk.controller;

import com.jk.bean.PoiTest;
import com.jk.service.PoiService;
import com.jk.utils.ExportExcel;
import com.jk.utils.importExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("poi")
public class poiController {
    @Autowired
    PoiService poiService;
    @RequestMapping("leadingin")
    public String leadingin(String originUrl) throws IOException {
        int startRow=2;
        int endRow=0;
        List<PoiTest> bookList = (List<PoiTest>) importExcel.importExcel(originUrl, startRow, endRow, PoiTest.class);
        for (PoiTest goods : bookList) {
            poiService.insertGoodsInfo(goods);
        }
        return "1";
    }
    @RequestMapping("derive")
    public String derive(String ids){
        String sheetName="商品列表";
        String titleName="我的列表";
        String[] headers = {"商品ID", "商品名称", "商品图片", "分类编号1" ,"分类编号2","品牌id","创建时间","商品描述"};
        List<PoiTest> dataSet = poiService.selectGoodsInfo(ids);
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File com = fsv.getHomeDirectory();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
        String format = simpleDateFormat.format(new Date());
        String resultUrl=com.getPath()+"/"+format+".xlsx";
        String pattern="yyyy-MM-dd";
        ExportExcel.exportExcel(sheetName, titleName, headers, dataSet, resultUrl, pattern);
        return "success";
    }
}
