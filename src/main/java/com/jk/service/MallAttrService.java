package com.jk.service;

import com.jk.bean.MallAttr;
import com.jk.bean.MallValue;
import com.jk.utils.ReceivePage;
import com.jk.utils.SendPage;

import java.util.List;

public interface MallAttrService {
    SendPage queryMallAttr(ReceivePage rp, MallAttr mallAttr);

    void addAttr(MallValue mallValue);

    List getmch(MallAttr mallAttr);
}
