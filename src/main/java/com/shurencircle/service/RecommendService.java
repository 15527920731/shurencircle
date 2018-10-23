package com.shurencircle.service;


import com.shurencircle.entity.Recommend;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface RecommendService {

    List<Recommend> queryAll(Integer type);

    Recommend queryRecommendById(Integer id);

    int addRecommend(Recommend recommend);

    int updateRecommend(Recommend recommend);

    int deleteById(Integer id);
}

