package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class MemberShippingAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 市
	 */
	private String city;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 0默认 1不默认
	 */
	private Integer isDefault;
	/**
	 * 
	 */
	private Date lastUpdateTime;
	/**
	 * 
	 */
	private Long memberId;

	private Member member;
	/**
	 * 省
	 */
	private String province;
	/**
	 * 收货人姓名
	 */
	private String shippingName;
	/**
	 * 收货人电话
	 */
	private String shippingPhone;




}
