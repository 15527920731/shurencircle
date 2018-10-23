package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class MemberLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 是否启用  0启用 1不启用
	 */
	private Integer isEnable;
	/**
	 * 等级图标
	 */
	private String levelIcon;
	/**
	 * 等级名称
	 */
	private String levelName;
	/**
	 * 最多开心果数
	 */
	private Integer maxNum;
	/**
	 * 最少开心果数
	 */
	private Integer minNum;




}
