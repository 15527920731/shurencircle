package com.shurencircle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.shurencircle.mapper.ConfigMapper;
import com.shurencircle.entity.Config;
import com.shurencircle.service.ConfigService;


@Service("configService")
public class ConfigServiceImpl  implements ConfigService {
    @Autowired
    private ConfigMapper configMapper;

    @Override
    public int addConfig(Config config) {
        return configMapper.addConfig(config);
    }

    @Override
    public List<Config> query() {
        return configMapper.query();
    }

    @Override
    public int updateConfig(Config config) {
        return configMapper.updateConfig(config);
    }


}
