package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class UsedGoodsCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 
	 */
	private String categoryName;
	/**
	 * 是否启用  0启用 1不启用
	 */
	private Integer isEnable;
	/**
	 * 父级分类id
	 */
	private Long parentCategoryId;


	private Date createTime;

}
