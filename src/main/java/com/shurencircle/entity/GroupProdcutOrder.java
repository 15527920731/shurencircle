package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class GroupProdcutOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 团购商品id
	 */
	private Long groupProdcutId;
	/**
	 * 是否团长； 1是 2 不是
	 */
	private Integer isHead;
	/**
	 * 
	 */
	
	private String orderNumber;
	/**
	 * 1 活动订单 2 组团秒杀订单 3 闲置订单 4 走步订单
	 */
	private Integer extensionType;
	/**
	 * 团id
	 */
	private Long tuanId;




}
