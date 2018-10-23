package com.shurencircle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.shurencircle.mapper.RecommendMapper;
import com.shurencircle.entity.Recommend;
import com.shurencircle.service.RecommendService;


@Service("recommendService")
public class RecommendServiceImpl  implements RecommendService {
    @Autowired
    private RecommendMapper recommendMapper;


    @Override
    public List<Recommend> queryAll(Integer type) {
        return recommendMapper.queryAll(type);
    }

    @Override
    public Recommend queryRecommendById(Integer id) {
        return recommendMapper.queryRecommendById(id);
    }

    @Override
    public int addRecommend(Recommend recommend) {
        return recommendMapper.addRecommend(recommend);
    }

    @Override
    public int updateRecommend(Recommend recommend) {
        return recommendMapper.updateRecommend(recommend);
    }

    @Override
    public int deleteById(Integer id) {
        return recommendMapper.deleteById(id);
    }
}
