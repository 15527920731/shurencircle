package com.shurencircle.mapper;

import com.shurencircle.entity.UsedGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface UsedGoodsMapper{
    List<UsedGoods> queryAll();

    int addUsedGoods(UsedGoods usedGoods);

    int updateUsedGoods(UsedGoods usedGoods);

    int deleteById(@Param("id") Integer id);
}
