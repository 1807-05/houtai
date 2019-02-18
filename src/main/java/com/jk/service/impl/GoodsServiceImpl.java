package com.jk.service.impl;


import com.jk.bean.GoodsInfo;
import com.jk.mapper.GoodsMapper;
import com.jk.service.GoodsService;
import com.jk.utils.FileUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


import java.util.Arrays;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List queryGoods() {
        return goodsMapper.queryGoods();
    }

    @Override
    public List querySecondGoods(Integer id) {
        return goodsMapper.querySecondGoods(id);
    }


    @Override
    @Transactional
    public void addGoods(GoodsInfo goodsInfo) {
        goodsMapper.addGoods(goodsInfo);
        Integer id=goodsMapper.queryId();
        String[] split = goodsInfo.getShp_tp().split(",");
        List<String> imgList = Arrays.asList(split);
        goodsMapper.addImg(imgList,id);
    }

}
