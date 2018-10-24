package com.shurencircle.service;


import com.shurencircle.entity.UsedGoods;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;


public interface UsedGoodsService {

    List<UsedGoods> queryAll(Integer categoryOneId ,
                             Integer categoryTwoId ,
                             Integer releaseType ,
                             Integer status ,
                             Date startTime ,
                             Date endTime);

    UsedGoods  queryUsedGoodsById(Integer id );

    int addUsedGoods(UsedGoods usedGoods);

    int updateUsedGoods(UsedGoods usedGoods);

    int deleteById(Integer id);
}

