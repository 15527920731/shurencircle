package com.shurencircle.controller;

import com.shurencircle.entity.Recommend;
import com.shurencircle.enums.ResultEnum;
import com.shurencircle.service.RecommendService;
import com.shurencircle.utils.ImageUtil;
import com.shurencircle.utils.Result;
import com.shurencircle.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Controller
@RequestMapping("/admin/recommend")
public class RecommendController {
    @Autowired
    private RecommendService recommendService;
    @RequestMapping("/recommendlist")
    public String recommendlist(Model model){
        model.addAttribute("recommendlist",recommendService.queryAll(1));
        return "recommend-list";
    }
    @RequestMapping("/recommendaddUI/{type}")
    public String recommendaddUI(@PathVariable(value = "type")Integer type, Model model){
        /*if(type==1){
            return "recommend-add1";
        }else if(type==2){
            return "recommend-add1";
        }else if(type==3){
            return "recommend-add1";
        }else if(type==4){
            return "recommend-add1";
        }else if(type==5){
            return "recommend-add1";
        }*/
        return "recommend-add"+type;
    }

    //新增
    @RequestMapping("/addrecommend")
    @ResponseBody
    public ResultVO addrecommend(Recommend recommend,@RequestParam(value = "file" ,required = false) MultipartFile file){
        if(file!=null){
            String path=ImageUtil.generateNormalImg(file,"/img/","E:/test/shurencircle");
            recommend.setImgPath(path);
        }
        recommend.setCreateTime(new Date());
        recommendService.addRecommend(recommend);
        return Result.success();
    }


    //ajax修改

    @ResponseBody
    @RequestMapping("/enable")
    public ResultVO enable(Recommend recommend){
        recommendService.updateRecommend(recommend);
        return Result.success();
    }

    //修改页面
    @RequestMapping("/upadterecommendUI/{id}")
    public String upadterecommendUI(@PathVariable(value = "id")Integer id,Model model){
        model.addAttribute("recommend",recommendService.queryRecommendById(id));
        return "recommend-update";
    }



    //修改
    @RequestMapping("/upadterecommend")
    @ResponseBody
    public ResultVO upadterecommend(Recommend recommend,@RequestParam(value = "file" ,required = false) MultipartFile file){
        if(file!=null){
            String path=ImageUtil.generateNormalImg(file,"/img/","E:/test/shurencircle");
            recommend.setImgPath(path);
        }
        recommendService.updateRecommend(recommend);
        return Result.success();
    }

    //删除
    @RequestMapping("/deletecommend/{id}")
    @ResponseBody
    public ResultVO deletecommend(@PathVariable(value = "id")Integer id){
        try {
            int result = recommendService.deleteById(id);
            if (result==0)
                return Result.error(ResultEnum.DELETE_FAIL_NODATA);
        }catch (Exception e){
            return Result.error(ResultEnum.DELETE_FAIL_EXCEPTION);
        }
        return Result.success();
    }



    //虚拟宝贝推荐管理
    @RequestMapping("/recommendgoodlist")
    public String recommendgoodlist(Model model){
        model.addAttribute("recommendgoodslist",recommendService.queryAll(2));
        return "recommend-goods-list";
    }

    @RequestMapping("/addrecommendgoodUI")
    public String recommendgoodlist(){
        return "recommend-goods-add";
    }













}
