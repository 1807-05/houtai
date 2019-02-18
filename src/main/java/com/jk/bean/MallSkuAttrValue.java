package com.jk.bean;

import lombok.Data;

import java.util.Date;

//  t_mall_sku_attr_value(sku属性和属性值关联表)
@Data
public class MallSkuAttrValue {


   private  Integer id;                  // (编号)    

   private Integer shxm_id;             //(属性名id)  

   private Integer shxzh_id;            //(属性值id) 

   private Integer shp_id;              // (商品id)   

   private String is_sku;               // (是否sku)  

   private Date chjshj;                  // (创建时间)  

   private Integer sku_id;              // (skuid)  

}
