package com.jk.service;

import com.jk.bean.ComBean;
import com.jk.bean.Zc;

import java.util.List;

public interface ExcomService {

    List<Zc> queryZc();

    void addZc(Zc zc);

    void delZc(Integer id);

    List<ComBean> queryCom();

    void updateCom(Integer id);

    void delCom(Integer id);
}
