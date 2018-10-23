package com.shurencircle.service;


import com.shurencircle.entity.MemberLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface MemberLevelService {

    List<MemberLevel> queryAll();

    MemberLevel queryMemberLevelByLevelBy(Integer id );

    int addMemberLevel(MemberLevel memberLevel);

    int updateMemberLevel(MemberLevel memberLevel);

    int deleteById(Integer id);
}

