package com.jk.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class PoiTest {
    private Integer id; //编号
    private String shp_mch;//商品名称
    private String shp_tp;//商品图片
    private Integer flbh1;//分类编号1
    private Integer flbh2;//分类编号2
    private Integer pp_id;//品牌id

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date chjshj;//创建时间
    private String shp_msh;//商品描述
}
