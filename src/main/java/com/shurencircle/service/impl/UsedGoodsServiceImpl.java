package com.shurencircle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.shurencircle.mapper.UsedGoodsMapper;
import com.shurencircle.entity.UsedGoods;
import com.shurencircle.service.UsedGoodsService;


@Service("usedGoodsService")
public class UsedGoodsServiceImpl  implements UsedGoodsService {
    @Autowired
    private UsedGoodsMapper usedGoodsMapper;


    @Override
    public List<UsedGoods> queryAll() {
        return usedGoodsMapper.queryAll();
    }

    @Override
    public int addUsedGoods(UsedGoods usedGoods) {
        return usedGoodsMapper.addUsedGoods(usedGoods);
    }

    @Override
    public int updateUsedGoods(UsedGoods usedGoods) {
        return usedGoodsMapper.updateUsedGoods(usedGoods);
    }

    @Override
    public int deleteById(Integer id) {
        return usedGoodsMapper.deleteById(id);
    }
}
