package com.shurencircle.service;


import com.shurencircle.entity.Config;

import java.util.List;
import java.util.Map;


public interface ConfigService {
    int addConfig(Config config);

    List<Config> query();

    int updateConfig(Config config);
}

