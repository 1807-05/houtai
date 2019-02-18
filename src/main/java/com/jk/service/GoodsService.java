package com.jk.service;

import com.jk.bean.GoodsInfo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface GoodsService {
    List queryGoods();

    List querySecondGoods(Integer id);


    void addGoods(GoodsInfo goodsInfo);
}
