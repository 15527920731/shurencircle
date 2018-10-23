package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class GroupProdcutDiscuss implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 
	 */
	private String discuss;
	/**
	 * 商品id
	 */
	private Long groupProductId;
	/**
	 * 
	 */
	private Long memberId;
	/**
	 * 评价时间
	 */
	private Date discussTime;




}
