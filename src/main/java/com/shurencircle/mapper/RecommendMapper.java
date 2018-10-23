package com.shurencircle.mapper;

import com.shurencircle.entity.Recommend;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface RecommendMapper{
    List<Recommend> queryAll(@Param("type")Integer type);

    Recommend queryRecommendById(@Param("id")Integer id);

    int addRecommend(Recommend recommend);

    int updateRecommend(Recommend recommend);

    int deleteById(@Param("id") Integer id);
}
