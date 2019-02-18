package com.jk.mapper;

import com.jk.bean.Addmsmsav;
import com.jk.bean.MallSkuAttrValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallSkuMapper {
    List getprodbyid(Integer id);

    List getchecked(Integer id);

    List querythis(Integer ids);

    void addmallsku(Addmsmsav addmsmsav);

    void addmallskuattrVal(@Param("list") List<MallSkuAttrValue> attrlist, @Param("add") Addmsmsav addmsmsav);
}
