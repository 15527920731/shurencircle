package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class GroupProdcutTuan implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 开团时间
	 */
	private Date startTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 团所需人数
	 */
	private Integer needMenberNum;
	/**
	 * 团现有人数
	 */
	private Integer nowMemberNum;
	/**
	 * 状态：1 进行中/2 拼团成功/3 拼团失败
	 */
	private Integer status;




}
