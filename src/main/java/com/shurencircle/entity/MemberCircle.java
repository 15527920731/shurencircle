package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class MemberCircle implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 下线id
	 */
	private Long childId;
	/**
	 * 会员id
	 */
	private Long memberId;
	/**
	 * 1 一级下线  2 二级下线
	 */
	private Integer type;




}
