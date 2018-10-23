package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class ZouBuOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private String orderNumber;
	/**
	 * 扩展类型 1活动订单 2 组团订单 3 闲置订单 4 走步订单
	 */
	private Integer extensionType;
	/**
	 * 
	 */
	private Long zoubuPrizeId;




}
