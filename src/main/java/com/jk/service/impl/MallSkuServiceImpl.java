package com.jk.service.impl;

import com.jk.bean.Addmsmsav;
import com.jk.mapper.MallSkuMapper;
import com.jk.service.MallSkuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MallSkuServiceImpl implements MallSkuService {

    @Resource
    MallSkuMapper mallSkuMapper;


    @Override
    public List getprodbyid(Integer id) {
        return mallSkuMapper.getprodbyid(id);
    }

    @Override
    public List getchecked(Integer id) {
        return mallSkuMapper.getchecked(id);
    }

    @Override
    public List querythis(Integer ids) {
        return mallSkuMapper.querythis(ids);
    }

    @Override
    public void addsku(Addmsmsav addmsmsav) {
        mallSkuMapper.addmallsku(addmsmsav);
        mallSkuMapper.addmallskuattrVal(addmsmsav.getAttrlist(),addmsmsav);
    }
}
