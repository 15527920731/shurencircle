package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 活动地域
	 */
	private String city;
	/**
	 * 已领取人数
	 */
	private Integer gotNum;
	/**
	 * 邀请人数
	 */
	private Integer inviteNum;
	/**
	 * 是否启用  0启用 1不启用
	 */
	private Integer isEnable;
	/**
	 * 需要支付开心果数量
	 */
	private Integer needPayNum;
	/**
	 * 奖品数量
	 */
	private Integer prizeNum;
	/**
	 * 活动标题
	 */
	private String title;
	/**
	 * 活动类型 1 送闲置 2 邀新 3整点抽奖 4合伙人
	 */
	private Integer activityType;
	/**
	 * 
	 */
	private Date startTime;
	/**
	 * 
	 */
	private Date endTime;
	/**
	 * 
	 */
	private Integer giveNum;




}
