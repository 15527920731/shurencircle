package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class UsedGoodsThank implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 感谢者
	 */
	private Long thinkId;
	/**
	 * 获得感谢的人
	 */
	private Long getThankId;
	/**
	 * 闲置物id
	 */
	private Long usedGoodsId;
	/**
	 * 感谢内容
	 */
	private String content;




}
