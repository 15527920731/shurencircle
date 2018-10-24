package com.shurencircle.controller;

import com.shurencircle.entity.Member;
import com.shurencircle.entity.MemberLevel;
import com.shurencircle.entity.UsedGoods;
import com.shurencircle.entity.UsedGoodsCategory;
import com.shurencircle.mapper.UsedGoodsCategoryMapper;
import com.shurencircle.service.MemberService;
import com.shurencircle.service.UsedGoodsCategoryService;
import com.shurencircle.service.UsedGoodsService;
import com.shurencircle.utils.ImageUtil;
import com.shurencircle.utils.Result;
import com.shurencircle.vo.ResultVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin/usedgoods")
public class UsedGoodsController {
    @Autowired
    private UsedGoodsCategoryService usedGoodsCategoryService;
    @Autowired
    private UsedGoodsService usedGoodsService;
    @Autowired
    private MemberService memberService;
    //一级分类列表
    @RequestMapping("/categorylist")
    public String categorylist(Model model,@RequestParam(required = false) String parentId){
        model.addAttribute("categorylist",usedGoodsCategoryService.queryAll(parentId));
        model.addAttribute("parentId",parentId);
        return "usedgoods-category-list";
    }
    //新增分类页
    @RequestMapping("/addcategoryUI/{parentId}")
    public String addcategoryUI(@PathVariable(value = "parentId",required = false)String parentId,Model model){
        model.addAttribute("parentId",parentId);
        return "usedgoods-category-add";
    }
    //修改分类页
    @RequestMapping("/updatecategoryUI/{id}")
    public String updatecategoryUI(@PathVariable(value = "id",required = false)Integer id,Model model){
        model.addAttribute("usedgoodsCategory",usedGoodsCategoryService.queryById(id));
        return "usedgoods-category-update";
    }
    //新增分类
    @RequestMapping("/addcategory")
    @ResponseBody
    public ResultVO addcategoryUI(UsedGoodsCategory usedGoodsCategory){
        usedGoodsCategory.setCreateTime(new Date());
        usedGoodsCategoryService.addUsedGoodsCategory(usedGoodsCategory);
        return Result.success();
    }
    //修改分类
    @RequestMapping("/updatecategory")
    @ResponseBody
    public ResultVO updatecategory(UsedGoodsCategory usedGoodsCategory){
        usedGoodsCategoryService.updateUsedGoodsCategory(usedGoodsCategory);
        return Result.success();
    }
    //删除分类及其子分类
    @RequestMapping("/deletecategory/{id}")
    @ResponseBody
    public ResultVO addcategoryUI(@PathVariable("id")Integer id){
        usedGoodsCategoryService.deleteById(id);
        return Result.success();
    }

    //启用停用分类
    @RequestMapping("/enablecategory")
    @ResponseBody
    public ResultVO enablecategory(UsedGoodsCategory usedGoodsCategory){
        usedGoodsCategoryService.updateCategoryEnable(usedGoodsCategory);
        return Result.success();
    }

    //闲置物列表
    @RequestMapping("/usedgoodslist")
    public String usedgoodslist(@RequestParam(required = false)  Integer categoryOneId,
                                @RequestParam(required = false) Integer categoryTwoId ,
                                @RequestParam(required = false) Integer releaseType ,
                                @RequestParam(required = false) Integer status ,
                                @RequestParam(required = false) Date startTime ,
                                @RequestParam(required = false) Date endTime,
                                Model model
                                ){
        model.addAttribute("usedgoodslist",
        usedGoodsService.queryAll(categoryOneId,categoryTwoId ,releaseType ,
                status ,startTime ,endTime));
        if(StringUtils.isEmpty(releaseType))
            releaseType=1;
        model.addAttribute("releaseType",releaseType);
        model.addAttribute("startTime",startTime);
        model.addAttribute("endTime",endTime);
        return "usedgoods-list";
    }



    //分类
    @PostMapping("/ajaxcategorylist")
    @ResponseBody
    public ResultVO ajaxcategorylist(@RequestParam(required = false)String parentId){
        return Result.success( usedGoodsCategoryService.queryAll(parentId));
    }
    //闲置物新增页面
    @RequestMapping("addusedgoodsUI")
    public String addusedgoodsUI(){
        return "usedgoods-add";
    }

    @ResponseBody
    @PostMapping("/addusedgoods")
    public ResultVO addlevel(UsedGoods usedGoods,
                             @RequestParam(value = "images",required = false) MultipartFile[] images,
                             @RequestParam(value = "videos",required = false) MultipartFile[] videos
                             ){
        StringBuffer sbf1=new StringBuffer();
        StringBuffer sbf2=new StringBuffer();
        if(images!=null){
            for (int i=0;i<images.length;i++){
                String path=ImageUtil.generateNormalImg(images[i],"/img/","E:/test/shurencircle");
                sbf1.append(path);
                if(i!=images.length-1)
                    sbf1.append(",");
            }
        }
        if(videos!=null){
            for (int i=0;i<videos.length;i++){
                String path=ImageUtil.generateNormalImg(videos[i],"/video/","E:/test/shurencircle");
                sbf2.append(path);
                if(i!=videos.length)
                    sbf2.append(",");
            }
        }

        usedGoods.setImgPath(sbf1.toString());
        usedGoods.setVideoPath(sbf2.toString());
        usedGoods.setReleaseTime(new Date());
        usedGoods.setStatus(1);
        usedGoodsService.addUsedGoods(usedGoods);

        return Result.success();
    }

    //选择发布人
    @RequestMapping("/selectMember")
    public String list(Model model,
                       @RequestParam(required = false) Integer isPartner,
                       @RequestParam(required = false)String memberType,
                       @RequestParam(required = false)String memberLevelId,
                       @RequestParam(required = false)Date startTime,
                       @RequestParam(required = false)Date endTime ){
        List<Member> memberList= memberService.queryAll(isPartner,memberType,memberLevelId,startTime,endTime);
        model.addAttribute("memberList",memberList);
        if(!StringUtils.isEmpty(isPartner))
            model.addAttribute("isPartner",isPartner);
        if(!StringUtils.isEmpty(memberType))
            model.addAttribute("memberType",memberType);
        if(!StringUtils.isEmpty(memberLevelId))
            model.addAttribute("memberLevelId",memberLevelId);
        if(!StringUtils.isEmpty(startTime))
            model.addAttribute("startTime",startTime);
        if(!StringUtils.isEmpty(endTime))
            model.addAttribute("endTime",endTime);

        return "usedgoods-member-select";
    }


    //查看闲置详情
    @RequestMapping("/viewusedgoods/{id}")
    public String viewusedgoods(@PathVariable("id")Integer id,Model model){
        UsedGoods usedGoods=usedGoodsService.queryUsedGoodsById(id);
        model.addAttribute("usedGoods",usedGoods);
        String images=usedGoods.getImgPath();
        if(!StringUtils.isEmpty(images)) {
            String imagesPath[] = images.split(",");
            model.addAttribute("imagesPath", imagesPath);
        }
        String videos = usedGoods.getVideoPath();
        if(!StringUtils.isEmpty(videos)) {
            String[] videosPath = videos.split(",");
            model.addAttribute("videosPath",videosPath);
        }

        return "usedgoods-view";
    }






}
