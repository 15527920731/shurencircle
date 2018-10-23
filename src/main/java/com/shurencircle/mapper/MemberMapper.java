package com.shurencircle.mapper;

import com.shurencircle.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
public interface MemberMapper{
    List<Member> queryAll(@Param("isPartner")Integer isPartner,
                          @Param("memberType")String memberType,
                          @Param("memberLevelId")String memberLevelId,
                          @Param("startTime")Date startTime,
                          @Param("endTime")Date endTime);

    Member queryByMemberId(@Param("id")String id);

    int addMember(Member member);

    int updateMember(Member member);

    int deleteById(@Param("id") Integer id);
}
