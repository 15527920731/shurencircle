package com.shurencircle.controller;

import com.shurencircle.entity.Member;
import com.shurencircle.entity.MemberLevel;
import com.shurencircle.entity.MemberShippingAddress;
import com.shurencircle.exception.GlobleException;
import com.shurencircle.service.MemberLevelService;
import com.shurencircle.service.MemberService;
import com.shurencircle.service.MemberShippingAddressService;
import com.shurencircle.utils.ImageUtil;
import com.shurencircle.utils.Result;
import com.shurencircle.utils.UUIDUtils;
import com.shurencircle.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private MemberLevelService memberLevelService;
    @Autowired
    private MemberShippingAddressService memberShippingAddressService;

    @RequestMapping("/index")
    public String test(){
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }




    //会员列表
    @RequestMapping("/list")
    public String list(Model model,
                       @RequestParam(required = false) Integer isPartner,
                       @RequestParam(required = false)String memberType,
                       @RequestParam(required = false)String memberLevelId,
                       @RequestParam(required = false)Date startTime,
                       @RequestParam(required = false)Date endTime )
                        {
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

        return "member-list";
    }

    //新增会员页面
    @RequestMapping("/memberaddUI")
    public String memberaddUI(Model model){
        List<MemberLevel> memberLevelList= memberLevelService.queryAll();
        model.addAttribute("memberLevelList",memberLevelList);
        return "member-add";
    }
    //新增会员
    @RequestMapping("/memberadd")
    @ResponseBody
    public ResultVO memberadd(Member member, @RequestParam(value = "avatarurl") MultipartFile avatarurl){
        String path=ImageUtil.generateNormalImg(avatarurl,"/img/","E:/test/shurencircle");
        member.setAvatarUrl(path);
        member.setCode(UUIDUtils.generateUUID());
        memberService.addMember(member);
        return Result.success();
    }
    //启用不启用用户
    @RequestMapping("/enablemember")
    @ResponseBody
    public ResultVO enablemember(Member member){
        memberService.updateMember(member);
        return Result.success();
    }


    @RequestMapping("/memberupdateUI")
    public String memberupdateUI(Model model,String id){
        Member member= memberService.queryByMemberId(id);
        List<MemberLevel> memberLevelList= memberLevelService.queryAll();
        model.addAttribute("memberLevelList",memberLevelList);
        model.addAttribute("member",member);
        return "member-update";
    }
    @RequestMapping("/memberupdate")
    @ResponseBody
    public ResultVO memberupdate(Member member, @RequestParam(value = "avatarurl" ,required = false) MultipartFile avatarurl){
        if(avatarurl!=null){
            String path=ImageUtil.generateNormalImg(avatarurl,"/img/","E:/test/shurencircle");
            member.setAvatarUrl(path);
        }
        System.out.println(member.getRegisterTime());
        memberService.updateMember(member);
        return Result.success();
    }



    //会员收货地址列表
    @RequestMapping("/memberaddresslist")
    public String memberaddresslist(Model model,String id,String name){
        List<MemberShippingAddress> memberShippingAddressList= memberShippingAddressService.queryByMId(id);
        model.addAttribute("memberShippingAddressList",memberShippingAddressList);
        model.addAttribute("name",name);

        return "member-address-list";
    }




    //会员等级列表
    @RequestMapping("/memberlevellist")
    public String level(Model model){
        List<MemberLevel> memberLevelList= memberLevelService.queryAll();
        model.addAttribute("memberLevelList",memberLevelList);
        return "member-level-list";
    }
    //新增会员等级页面
    @RequestMapping("/memberleveladdUI")
    public String memberleveladdUI(){
        return "member-level-add";
    }
    //新增会员等级
    @ResponseBody
    @PostMapping("/memberleveladd")
    public ResultVO addlevel(MemberLevel memberLevel,@RequestParam(value = "levelIco") MultipartFile levelIco){
        String path=ImageUtil.generateNormalImg(levelIco,"/img/","E:/test/shurencircle");
        memberLevel.setLevelIcon(path);

        memberLevelService.addMemberLevel(memberLevel);
        return Result.success();
    }

    //修改会员等级页面
    @RequestMapping("/memberlevelupdateUI")
    public String memberlevelupdateUI(Model model,Integer id){
        MemberLevel memberLevel= memberLevelService.queryMemberLevelByLevelBy(id);
        model.addAttribute("memberLevel",memberLevel);
        return "member-level-update";
    }

    //停用启用会员等级
    @RequestMapping("/enablememberlevel")
    @ResponseBody
    public ResultVO enablememberlevel(MemberLevel m){
        memberLevelService.updateMemberLevel(m);
        return Result.success();
    }

    //修改会员等级
    @RequestMapping("/memberlevelupdate")
    @ResponseBody
    public ResultVO memberlevelupdate(MemberLevel memberLevel, @RequestParam(value = "file" ,required = false) MultipartFile file){
        if(file!=null){
            String path=ImageUtil.generateNormalImg(file,"/img/","E:/test/shurencircle");
            memberLevel.setLevelIcon(path);
        }
        memberLevelService.updateMemberLevel(memberLevel);
        return Result.success();
    }



}
