package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class MemberWatch implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 类型1 1关注2  类型2 2关注1
	 */
	private Integer type;
	/**
	 * 1
	 */
	private Long oneid;
	/**
	 * 2
	 */
	private Long twoid;




}
