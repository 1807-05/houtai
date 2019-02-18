package com.jk.mapper;

import com.jk.bean.PoiTest;

import java.util.List;

public interface PoiMapper {
    void insertGoodsInfo(PoiTest goods);

    List<PoiTest> selectGoodsInfo(String ids);
}
