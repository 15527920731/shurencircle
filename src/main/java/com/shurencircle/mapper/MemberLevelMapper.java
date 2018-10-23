package com.shurencircle.mapper;

import com.shurencircle.entity.MemberLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface MemberLevelMapper{
    List<MemberLevel> queryAll();

    MemberLevel queryMemberLevelByLevelBy(@Param("id") Integer id );

    int addMemberLevel(MemberLevel memberLevel);

    int updateMemberLevel(MemberLevel memberLevel);

    int deleteById(@Param("id") Integer id);
}
