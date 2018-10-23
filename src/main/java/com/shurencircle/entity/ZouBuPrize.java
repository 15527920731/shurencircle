package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class ZouBuPrize implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * //是否启用  0启用 1不启用
	 */
	private Integer isEnable;
	/**
	 * 奖品位置
	 */
	private Integer position;
	/**
	 * 
	 */
	private String prizeImg;
	/**
	 * 
	 */
	private String prizeName;
	/**
	 * 
	 */
	private Integer prizeNum;
	/**
	 * //1 虚拟奖品 2 实物奖品
	 */
	private Integer prizeType;
	/**
	 * 中奖概率
	 */
	private String probability;




}
