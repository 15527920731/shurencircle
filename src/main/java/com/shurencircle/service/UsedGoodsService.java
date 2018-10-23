package com.shurencircle.service;


import com.shurencircle.entity.UsedGoods;

import java.util.List;
import java.util.Map;


public interface UsedGoodsService {

    List<UsedGoods> queryAll();

    int addUsedGoods(UsedGoods usedGoods);

    int updateUsedGoods(UsedGoods usedGoods);

    int deleteById(Integer id);
}

