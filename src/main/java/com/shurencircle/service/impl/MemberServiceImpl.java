package com.shurencircle.service.impl;

import com.shurencircle.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.shurencircle.mapper.MemberMapper;
import com.shurencircle.entity.Member;
import com.shurencircle.service.MemberService;


@Service("memberService")
public class MemberServiceImpl  implements MemberService {
    @Autowired
    private MemberMapper memberMapper;


    @Override
    public List<Member> queryAll(Integer isPartner,
                                 String memberType,
                                 String memberLevelId,
                                 Date startTime,
                                 Date endTime) {
        return memberMapper.queryAll(isPartner,memberType,memberLevelId,startTime,endTime);
    }

    @Override
    public Member queryByMemberId(String id) {
        return memberMapper.queryByMemberId(id);
    }

    @Override
    public int addMember(Member member) {
        member.setCode(UUIDUtils.generateUUID());
        return memberMapper.addMember(member);
    }

    @Override
    public int updateMember(Member member) {
        return memberMapper.updateMember(member);
    }

    @Override
    public int deleteById(Integer id) {
        return memberMapper.deleteById(id);
    }
}
