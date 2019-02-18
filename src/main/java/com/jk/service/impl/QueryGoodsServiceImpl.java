package com.jk.service.impl;


import com.github.pagehelper.PageHelper;
import com.jk.bean.GoodsComment;
import com.jk.bean.GoodsInfo;
import com.jk.bean.Website;
import com.jk.mapper.GoodsMapper;
import com.jk.service.QueryGoodsService;
import com.jk.utils.ReceivePage;
import com.jk.utils.SendPage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QueryGoodsServiceImpl implements QueryGoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public SendPage queryAllGoods(GoodsInfo goods, ReceivePage page) {
        List<GoodsInfo> list = goodsMapper.queryAllGoods();

        PageHelper.startPage(page.getPage(),page.getRows());
        List<GoodsInfo> data = goodsMapper.queryAllGoods();

        SendPage  sp=new SendPage(list.size(),data);

        return sp;
    }

    @Transactional
    @Override
    public void deleteOneGoods(String id) {
        goodsMapper.deleteOneGoods(id);
        goodsMapper.deleteTwoGoods(id);
    }

    @Override
    public List queryGoodsComment(GoodsComment  comment) {
  /*      List<GoodsComment>  list=goodsMapper.queryGoodsComment(comment);

        PageHelper.startPage(page.getPage(),page.getRows());
        List<GoodsComment>  data=goodsMapper.queryGoodsComment(comment);

        SendPage  sp=new  SendPage(list.size(),data);
        return sp;*/

       return   goodsMapper.queryGoodsComment(comment);
    }
    @Override
    public SendPage querytite(ReceivePage page) {
        List<Website> list = goodsMapper.querytite();

        PageHelper.startPage(page.getPage(),page.getRows());
        List<Website> data = goodsMapper.querytite();

        SendPage  sp=new SendPage(list.size(),data);

        return sp;
    }

    @Override
    public void deletegoodtite(String id) {
        goodsMapper.deletetite(id);

    }

    @Override
    public void goodstiteadd(Website website) {
        if(website.getId()!=null){
            goodsMapper.updategoodstite(website);
        }else {
            goodsMapper.goodstiteadd(website);
        }
    }

    @Override
    public Website updategoods(String  id) {

        return goodsMapper.updategoods(id);

    }

    @Override
    public List queryids(String ids) {

        return goodsMapper.queryids(ids);
    }
}
