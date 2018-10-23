package com.shurencircle.controller;

import java.util.Arrays;
import java.util.Map;

import com.shurencircle.entity.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.shurencircle.service.ConfigService;




/**
 * 
 *
 * @author hu
 * @email 
 * @date 2018-10-18 14:14:54
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    private ConfigService configService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Object list(){
        return configService.query();
    }

    @RequestMapping("/add")
    public Object add(Config config){
        return configService.addConfig(config);
    }

    @RequestMapping("/update")
    public Object update(Config config){
        return configService.updateConfig(config);
    }


}
