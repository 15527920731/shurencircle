package com.shurencircle.entity;


import lombok.Data;


import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;


@Data
public class GroupProdcut implements Serializable {
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
	 * 商品介绍
	 */
	private String content;
	/**
	 * 商品封面图
	 */
	private String coverImg;
	/**
	 * 运费
	 */
	private BigDecimal freight;
	/**
	 * 拼团所需人数
	 */
	private Integer groupNeedNum;
	/**
	 * 是否启用  0启用 1不启用
	 */
	private Integer isEnable;
	/**
	 * 商品价格
	 */
	private BigDecimal money;
	/**
	 * 商品已拼数量
	 */
	private Integer outNum;
	/**
	 * 
	 */
	private String productImg;
	/**
	 * 
	 */
	private String productName;
	/**
	 * 商品总数
	 */
	private Integer productNum;




}
