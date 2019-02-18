package com.jk.service.impl;

import com.jk.bean.ComBean;
import com.jk.bean.Zc;
import com.jk.mapper.ExcomMapper;
import com.jk.service.ExcomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExcomServiceImpl implements ExcomService {
    @Autowired
    private ExcomMapper excomMapper;

    @Override
    public List<Zc> queryZc() {
        return excomMapper.queryZc();
    }

    @Override
    public void addZc(Zc zc) {
        excomMapper.addZc(zc);
    }

    @Override
    public void delZc(Integer id) {
        excomMapper.delZc(id);
    }

    @Override
    public List<ComBean> queryCom() {
        return excomMapper.queryCom();
    }

    @Override
    public void updateCom(Integer id) {
        excomMapper.updateCom(id);
    }

    @Override
    public void delCom(Integer id) {
        excomMapper.delCom(id);
    }
}
