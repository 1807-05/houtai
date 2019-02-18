package com.jk.service.impl;

import com.jk.bean.PoiTest;
import com.jk.mapper.PoiMapper;
import com.jk.service.PoiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PoiServiceImpl implements PoiService {
    @Resource
    PoiMapper poiMapper;
    @Override
    public void insertGoodsInfo(PoiTest goods) {
        poiMapper.insertGoodsInfo(goods);
    }

    @Override
    public List<PoiTest> selectGoodsInfo(String ids) {
        return poiMapper.selectGoodsInfo(ids);
    }
}
