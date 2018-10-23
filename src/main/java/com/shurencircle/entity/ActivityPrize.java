package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class ActivityPrize implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 活动id
	 */
	private Long activityId;
	/**
	 * 奖品介绍
	 */
	private String prizeContent;
	/**
	 * 
	 */
	private String prizeImg;
	/**
	 * 奖品名
	 */
	private String prizeName;
	/**
	 * 
	 */
	private Integer prizeRemainNum;
	/**
	 * 
	 */
	private Integer prizeTotalNum;
	/**
	 * 奖品类型 1 虚拟奖品 2 实物奖品
	 */
	private Integer prizeType;
	/**
	 * 
	 */
	private Date createTime;




}
