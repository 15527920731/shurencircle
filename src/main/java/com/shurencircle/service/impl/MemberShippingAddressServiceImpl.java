package com.shurencircle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.shurencircle.mapper.MemberShippingAddressMapper;
import com.shurencircle.entity.MemberShippingAddress;
import com.shurencircle.service.MemberShippingAddressService;


@Service("memberShippingAddressService")
public class MemberShippingAddressServiceImpl  implements MemberShippingAddressService {
    @Autowired
    private MemberShippingAddressMapper memberShippingAddressMapper;


    @Override
    public List<MemberShippingAddress> queryAll() {
        return memberShippingAddressMapper.queryAll();
    }

    @Override
    public List<MemberShippingAddress> queryByMId(String id) {
        return memberShippingAddressMapper.queryByMId(id);
    }

    @Override
    public int addMemberShippingAddress(MemberShippingAddress memberShippingAddress) {
        return memberShippingAddressMapper.addMemberShippingAddress(memberShippingAddress);
    }

    @Override
    public int updateMemberShippingAddress(MemberShippingAddress memberShippingAddress) {
        return memberShippingAddressMapper.updateMemberShippingAddress(memberShippingAddress);
    }

    @Override
    public int deleteById(Integer id) {
        return memberShippingAddressMapper.deleteById(id);
    }
}
