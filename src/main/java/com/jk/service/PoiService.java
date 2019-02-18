package com.jk.service;

import com.jk.bean.PoiTest;

import java.util.List;

public interface PoiService {
    void insertGoodsInfo(PoiTest goods);

    List<PoiTest> selectGoodsInfo(String ids);
}
