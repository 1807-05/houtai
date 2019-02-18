package com.jk.mapper;

import com.jk.bean.ComBean;
import com.jk.bean.Zc;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ExcomMapper {

    List<Zc> queryZc();

    @Insert("Insert into t_zc (zc) values(#{zc})")
    void addZc(Zc zc);

    @Delete("Delete from t_zc where id=#{id}")
    void delZc(Integer id);

    @Select("select * from t_mall_product_comment where dd_state=2")
    List<ComBean> queryCom();

    @Update("update t_mall_product_comment set dd_state=1 where id=#{id}")
    void updateCom(Integer id);

    @Delete("Delete from t_mall_product_comment where id=#{id}")
    void delCom(Integer id);
}
