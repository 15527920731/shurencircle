package com.shurencircle.controller;


import com.shurencircle.utils.ChatResult;
import com.shurencircle.utils.FastJsonUtils;
import com.shurencircle.utils.HttpRequestUtil;
import com.shurencircle.utils.WxLoginResult;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Random;

/**
 * 微信登录
 */
@RestController
@RequestMapping("chat")
public class ChatController {

    private Integer count;
    private String SECRET = "3c8358a8783f557bf4ea567140f82659";
    private String APPID = "wxdf34e2e80b318c96";
    private String JS_CODE;
    @RequestMapping(value = "/random",method = RequestMethod.POST)
    public ChatResult randomChat(){

        //用户随机分配聊天室
        Random random  = new Random();
        int i = random.nextInt(3);
        return new ChatResult(100,"分配成功",i);

    }
    @PostMapping("/login/{code}")
    public ChatResult auth(@PathVariable("code")String code){
        WxLoginResult wxLoginResult = null;
        JS_CODE = code;
        String msg;
        String loginValidURL = "https://api.weixin.qq.com/sns/jscode2session?appid="+APPID+"&secret="+SECRET+"&js_code="+JS_CODE+"&grant_type=authorization_code";
        try {
            wxLoginResult = FastJsonUtils.toBean(HttpRequestUtil.get(loginValidURL), WxLoginResult.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
       return new ChatResult(200,"success",wxLoginResult.getOpenid());
    }


}
