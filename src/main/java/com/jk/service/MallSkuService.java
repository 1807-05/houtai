package com.jk.service;

import com.jk.bean.Addmsmsav;

import java.util.List;

public interface MallSkuService {
    List getprodbyid(Integer id);

    List getchecked(Integer id);

    List querythis(Integer ids);

    void addsku(Addmsmsav addmsmsav);
}
