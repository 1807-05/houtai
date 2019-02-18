package com.jk.bean;

import lombok.Data;

import java.util.Date;

@Data
public class MallAttr {

    private Integer id;                //(编号)     

    private String shxmMch;            //(属性名称) 

    private String shfqy;               //(是否启用)    

    private Integer flbh2;              // (分类编号2)   

    private Date chjshj;                //(创建时间) 

    private String shxmValue;           //属性值

    private Integer vid;                //(编号)   





}
