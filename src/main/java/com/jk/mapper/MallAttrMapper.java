package com.jk.mapper;

import com.jk.bean.MallAttr;
import com.jk.bean.MallValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MallAttrMapper {

    List<MallAttr> queryMallAttr(MallAttr mallAttr);


    void addAttr(@Param("id") int id,@Param("mv") MallValue mallValue);

    void addAttrValue(Map<String, Object> map);

    Integer selectAttrId();
}
