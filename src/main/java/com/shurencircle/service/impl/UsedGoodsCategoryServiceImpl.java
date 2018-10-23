package com.shurencircle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.shurencircle.mapper.UsedGoodsCategoryMapper;
import com.shurencircle.entity.UsedGoodsCategory;
import com.shurencircle.service.UsedGoodsCategoryService;


@Service("usedGoodsCategoryService")
public class UsedGoodsCategoryServiceImpl  implements UsedGoodsCategoryService {
    @Autowired
    private UsedGoodsCategoryMapper usedGoodsCategoryMapper;


    @Override
    public List<UsedGoodsCategory> queryAll(String parentId) {
        return usedGoodsCategoryMapper.queryAll(parentId);
    }

    @Override
    public UsedGoodsCategory queryById(Integer id) {
        return usedGoodsCategoryMapper.queryById(id);
    }

    @Override
    public int addUsedGoodsCategory(UsedGoodsCategory usedGoodsCategory) {
        return usedGoodsCategoryMapper.addUsedGoodsCategory(usedGoodsCategory);
    }

    @Override
    public int updateUsedGoodsCategory(UsedGoodsCategory usedGoodsCategory) {
        return usedGoodsCategoryMapper.updateUsedGoodsCategory(usedGoodsCategory);
    }

    @Override
    public int updateCategoryEnable(UsedGoodsCategory usedGoodsCategory) {
        return usedGoodsCategoryMapper.updateCategoryEnable(usedGoodsCategory);
    }

    @Override
    public int deleteById(Integer id) {
        return usedGoodsCategoryMapper.deleteById(id);
    }
}
