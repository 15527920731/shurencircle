package com.shurencircle.controller;

import com.shurencircle.entity.UsedGoodsCategory;
import com.shurencircle.mapper.UsedGoodsCategoryMapper;
import com.shurencircle.service.UsedGoodsCategoryService;
import com.shurencircle.utils.Result;
import com.shurencircle.vo.ResultVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/admin/usedgoods")
public class UsedGoodsController {
    @Autowired
    private UsedGoodsCategoryService usedGoodsCategoryService;
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



}
