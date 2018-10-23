package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class Logistics implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 物流公司
	 */
	private String companyName;
	/**
	 * 物流单号
	 */
	private Integer logisticsNum;
	/**
	 * 
	 */
	private String orderNumber;




}
