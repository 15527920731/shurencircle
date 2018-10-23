package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class Config implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 
	 */
	private String description;
	/**
	 * 键名唯一
	 */
	private String name;
	/**
	 * 
	 */
	private String title;
	/**
	 * 数据转json存入
	 */
	private String value;




}
