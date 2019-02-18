package com.jk.bean;

import lombok.Data;

import java.util.Date;

@Data
public class MallSku {

    private Integer id;                 //(编号)    

    private Integer shp_id;           //(商品id)    

    private Integer kc;              //(库存数量)      -

    private Double jg;              //(价格)      -

    private Date chjshj;            //(创建时间) -

    private String sku_mch;         //(sku名称) -

    private Integer sku_xl;         //(sku销量)

    private String kcdz;            //(库存地址)-
}
