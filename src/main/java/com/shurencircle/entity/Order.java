package com.shurencircle.entity;


import lombok.Data;


import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;


@Data
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 总价
	 */
	private BigDecimal amount;
	/**
	 * 
	 */
	private Long memberId;
	/**
	 * 
	 */
	private String orderNumber;
	/**
	 * 订单状态 1 待确认 2待支付 3 待发货 4待收货 5 已完成 6待退款 7已退款 8已取消 9已失效
	 */
	private Integer orderStatus;
	/**
	 * 扩展类型 1活动订单 2 组团订单 3 闲置订单 4 走步订单 5整点抽奖订单
	 */
	private Integer extensionType;




}
