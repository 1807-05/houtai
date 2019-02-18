package com.jk.bean;

import lombok.Data;

import java.util.Date;

@Data
public class GoodsComment {

      private    Integer  id;  // (编号)

      private    Integer  yh_id;  //(用户id)      Integer

      private    String   plnr;   //(评论内容)     String(1000)

      private    Date     plshj;   //(平路时间)    Date

      private    Integer  hpjb;    //(好评级别)     Integer

      private    Integer  sku_id;  //(skuid)      Integer

      private    String   sku_mch;  //(sku名称)   String(100)

      private    Integer  shp_id;  //(商品id)     Integer

      private    String   shp_mch;  //(商品名称)  String(100)

      private    Integer   dd_id;   //(订单id)      Integer

      private     Integer  dd_state;  //   评论审核状态

      private     String   yh_mch;     //用户名称

      private     String   yh_nch;     //用户昵称


}
