package com.shurencircle.mapper;

import com.shurencircle.entity.Config;

import java.util.List;

public interface ConfigMapper{
    int addConfig(Config config);

    List<Config> query();

    int updateConfig(Config config);
	
}
