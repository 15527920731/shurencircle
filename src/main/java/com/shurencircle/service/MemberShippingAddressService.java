package com.shurencircle.service;


import com.shurencircle.entity.MemberShippingAddress;

import java.util.List;
import java.util.Map;


public interface MemberShippingAddressService {

    List<MemberShippingAddress> queryAll();

    List<MemberShippingAddress> queryByMId( String id);

    int addMemberShippingAddress(MemberShippingAddress memberShippingAddress);

    int updateMemberShippingAddress(MemberShippingAddress memberShippingAddress);

    int deleteById(Integer id);
}

