package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 头像地址  微信头像
	 */
	private String avatarUrl;
	/**
	 * 剩余开心果个数
	 */
	private Integer balanceNum;
	/**
	 * 城市  常驻城市
	 */
	private String city;
	/**
	 * 1男2女
	 */
	private Integer gender;
	/**
	 * 邀新数量
	 */
	private Integer inviteNum;
	/**
	 * 是否启用  0启用 1不启用
	 */
	private Integer isEnable;
	/**
	 * 是否合伙人  1 是 2 不是
	 */
	private Integer isPartner;
	/**
	 * 
	 */
	private Long memberLevelId;
	private MemberLevel memberLevel;
	/**
	 * 
	 */
	private String nickName;
	/**
	 * 
	 */
	private String openId;
	/**
	 * 
	 */
	private String phone;
	/**
	 * 注册时间
	 */
	private Date registerTime;
	/**
	 * 开心果总数
	 */
	private Integer totalNum;
	/**
	 * 增送闲置数量
	 */
	private Integer zengSongNum;
	/**
	 * 用户类似 1 真实用户 2 虚拟用户
	 */
	private Integer memberType;
	/**
	 * 是否手机认证 0 未认证 1 已认证
	 */
	private Integer isPhoneAuth;
	/**
	 * 邀请码
	 */
	private String code;


}
