package com.jk.service.impl;


import com.github.pagehelper.PageHelper;
import com.jk.bean.MallAttr;
import com.jk.bean.MallValue;
import com.jk.mapper.MallAttrMapper;
import com.jk.service.MallAttrService;
import com.jk.utils.ReceivePage;
import com.jk.utils.SendPage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MallAttrServiceImpl implements MallAttrService {


    @Resource
    MallAttrMapper mallAttrMapper;

    @Override
    public SendPage queryMallAttr(ReceivePage rp, MallAttr mallAttr) {


        List<MallAttr> list = mallAttrMapper.queryMallAttr(mallAttr);

        PageHelper.startPage(rp.getPage(),rp.getRows());
        List<MallAttr> data = mallAttrMapper.queryMallAttr(mallAttr);

        return new SendPage(list.size(),data);
    }

    @Override
    public void addAttr(MallValue mallValue) {

        Integer shxmId =  mallValue.getShxmId();

        mallAttrMapper.addAttr(shxmId,mallValue);
        Integer id = mallAttrMapper.selectAttrId();

        List<MallValue> list = mallValue.getList();
        for (MallValue value : list) {
            Map<String , Object> map =  new HashMap<String , Object>();
            map.put("shxzh", value.getShxzh());
            map.put("shxzhMch",value.getShxzhMch());
            map.put("shxmId",id);
            mallAttrMapper.addAttrValue(map);
        }



    }

    @Override
    public List getmch(MallAttr mallAttr) {
        return mallAttrMapper.queryMallAttr(mallAttr);
    }
}
