package com.shurencircle.entity;


import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class Recommend implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 广告楼层
	 */
	private Integer floor;
	/**
	 * 
	 */
	private String imgPath;
	/**
	 * 是否启用  0启用 1不启用
	 */
	private Integer isEnable;
	/**
	 * 推荐名称
	 */
	private String recommendName;
	/**
	 * 推荐类型 1 横向广告2 纵向广告3弹框广告4小活动5 大活动 6 闲置物品
	 */
	private Integer recommendType;
	private String recommendTypeName;

	public String getRecommendTypeName() {
		String name="";
		switch (recommendType) {
			case 1:
				name="横向广告";
				break;
			case 2:
				name="纵向广告";
				break;
			case 3:
				name="弹框广告";
				break;
			case 4:
				name="小活动";
				break;
			case 5:
				name="大活动";
				break;
			case 6:
				name="闲置物品";
				break;
		}
		return name;
	}

	/**
	 * 出现顺序
	 */
	private Integer sequence;
	/**
	 * 
	 */
	private String url;
	/**
	 * 闲置物id
	 */
	private Long usedGoodsId;

	private Date createTime;






}
