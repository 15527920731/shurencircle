package com.shurencircle.mapper;

import com.shurencircle.entity.MemberShippingAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface MemberShippingAddressMapper{
    List<MemberShippingAddress> queryAll();

    List<MemberShippingAddress> queryByMId(@Param("id") String id);

    int addMemberShippingAddress(MemberShippingAddress memberShippingAddress);

    int updateMemberShippingAddress(MemberShippingAddress memberShippingAddress);

    int deleteById(@Param("id") Integer id);
}
