package com.shurencircle.service;


import com.shurencircle.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;


public interface MemberService {

    List<Member> queryAll(Integer isPartner,
                          String memberType,
                          String memberLevelId,
                          Date startTime,
                          Date endTime);

    Member queryByMemberId(String id);

    int addMember(Member member);

    int updateMember(Member member);

    int deleteById(Integer id);
}

