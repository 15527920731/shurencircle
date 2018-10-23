package com.shurencircle.service;


import com.shurencircle.entity.UsedGoodsCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface UsedGoodsCategoryService {

    List<UsedGoodsCategory> queryAll(String parentId);

    UsedGoodsCategory queryById(Integer id);

    int addUsedGoodsCategory(UsedGoodsCategory usedGoodsCategory);

    int updateUsedGoodsCategory(UsedGoodsCategory usedGoodsCategory);

    int updateCategoryEnable(UsedGoodsCategory usedGoodsCategory);

    int deleteById(Integer id);
}

