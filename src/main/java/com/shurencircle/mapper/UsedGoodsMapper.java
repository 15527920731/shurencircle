package com.shurencircle.mapper;

import com.shurencircle.entity.UsedGoods;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
public interface UsedGoodsMapper{
    List<UsedGoods> queryAll(@Param("categoryOneId") Integer categoryOneId ,
                             @Param("categoryTwoId") Integer categoryTwoId ,
                             @Param("releaseType") Integer releaseType ,
                             @Param("status") Integer status ,
                             @Param("startTime") Date startTime ,
                             @Param("endTime") Date endTime
                             );

    UsedGoods  queryUsedGoodsById(@Param("id") Integer id );

    int addUsedGoods(UsedGoods usedGoods);

    int updateUsedGoods(UsedGoods usedGoods);

    int deleteById(@Param("id") Integer id);
}
