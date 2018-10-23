package com.shurencircle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.shurencircle.mapper.MemberLevelMapper;
import com.shurencircle.entity.MemberLevel;
import com.shurencircle.service.MemberLevelService;


@Service("memberLevelService")
public class MemberLevelServiceImpl  implements MemberLevelService {
    @Autowired
    private MemberLevelMapper memberLevelMapper;


    @Override
    public List<MemberLevel> queryAll() {
        return memberLevelMapper.queryAll();
    }

    @Override
    public MemberLevel queryMemberLevelByLevelBy(Integer id) {
        return memberLevelMapper.queryMemberLevelByLevelBy(id);
    }

    @Override
    public int addMemberLevel(MemberLevel memberLevel) {
        return memberLevelMapper.addMemberLevel(memberLevel);
    }

    @Override
    public int updateMemberLevel(MemberLevel memberLevel) {
        return memberLevelMapper.updateMemberLevel(memberLevel);
    }

    @Override
    public int deleteById(Integer id) {
        return memberLevelMapper.deleteById(id);
    }
}
