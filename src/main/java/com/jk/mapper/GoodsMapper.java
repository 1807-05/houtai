package com.jk.mapper;

import com.jk.bean.GoodsComment;
import com.jk.bean.GoodsInfo;
import com.jk.bean.Website;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {

    List queryGoods();

    List querySecondGoods(Integer id);

    void addGoods(GoodsInfo goodsInfo);

    Integer queryId();

    List<GoodsInfo> queryAllGoods();

    void addImg(@Param("img") List<String> img,@Param("id") Integer id);

    void deleteOneGoods(String id);

    void deleteTwoGoods(String id);

    List<GoodsComment> queryGoodsComment(GoodsComment comment);

    List<Website> querytite();

    void deletetite(String id);

    void goodstiteadd(Website website);

    Website updategoods(String id);

    void updategoodstite(Website website);

    List queryids(@Param("ids") String ids);
}
