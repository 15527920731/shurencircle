package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class UsedGoodsOrderApplicant implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 申请人id
	 */
	private Long applicantMemberId;
	/**
	 * 
	 */
	private String orderNumber;
	/**
	 * 申请状态 0 申请中 1申请成功 2 申请失败 3取消申请；
	 */
	private Integer status;
	/**
	 * 
	 */
	private Date applicantTime;
	/**
	 * 交货方式 1 快递 2 面交
	 */
	private Integer deliveryType;




}
