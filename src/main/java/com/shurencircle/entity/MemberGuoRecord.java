package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class MemberGuoRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 
	 */
	private Long memberId;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 增加个数
	 */
	private Integer addNum;
	/**
	 * 减少个数
	 */
	private Integer reduceNum;
	/**
	 * 主题
	 */
	private String recordTitle;




}
