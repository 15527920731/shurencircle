package com.shurencircle.mapper;

import com.shurencircle.entity.UsedGoodsCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface UsedGoodsCategoryMapper{
    List<UsedGoodsCategory> queryAll(@Param("parentCategoryId")String parentCategoryId);

    UsedGoodsCategory queryById(@Param("id")Integer id);

    int addUsedGoodsCategory(UsedGoodsCategory usedGoodsCategory);

    int updateUsedGoodsCategory(UsedGoodsCategory usedGoodsCategory);

    int updateCategoryEnable(UsedGoodsCategory usedGoodsCategory);

    int deleteById(@Param("id") Integer id);
}
