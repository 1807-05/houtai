package com.jk.bean;

//(属性值表) t_mall_value

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class MallValue {


    private Integer  id;              //(编号)  

    private String  shxzh;           //(属性值)       

    private String  shfqy;           //(是否启用)     

    private Integer shxmId;        //(属性id)     

    private String shxzhMch;       //(属性值名) 

    private Date chjshj;            //(创建时间)  

    private List<MallValue> list;

    private String shxmMch ;     //第一个表属性名


    private Integer aid;                //(编号)   
}
