package com.jk.service;

import com.jk.bean.GoodsComment;
import com.jk.bean.GoodsInfo;
import com.jk.bean.Website;
import com.jk.utils.ReceivePage;
import com.jk.utils.SendPage;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface QueryGoodsService {
    SendPage queryAllGoods(GoodsInfo goods, ReceivePage page);

    void deleteOneGoods(String id);

    List queryGoodsComment(GoodsComment comment);

    SendPage querytite(ReceivePage page);

    void deletegoodtite(String id);

    void goodstiteadd(Website website);

    Website updategoods(String  id);

    List queryids(String ids);

 }
