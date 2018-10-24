package com.shurencircle.entity;


import lombok.Data;


import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;


@Data
public class UsedGoods implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private Long id;
	/**
	 * 
	 */
	private String address;
	/**
	 * 
	 */
	private Long categoryOneId;
	private UsedGoodsCategory usedGoodsCategoryOne;
	/**
	 * 
	 */
	private Long categoryTwoId;
	private UsedGoodsCategory usedGoodsCategoryTwo;
	/**
	 * 
	 */
	private String chengSe;
	/**
	 * 
	 */
	private String content;
	/**
	 * 快递费
	 */
	private BigDecimal deliveryMoney;
	/**
	 * 交货方式 1 快递 2 面交
	 */
	private Integer deliveryType;
	private String deliveryTypeName;

	public String getDeliveryTypeName() {
		if(deliveryType==1){
			return "快递";
		}
		return "面交";
	}

	/**
	 * 
	 */
	private String goodsName;
	/**
	 * 
	 */
	private String imgPath;
	/**
	 * 是否启用  0启用 1不启用
	 */
	private Integer isEnable;
	/**
	 * 
	 */
	private Long memberId;
	private Member member;
	/**
	 * 发布时间
	 */
	private Date releaseTime;
	/**
	 * 排序时间
	 */
	private Date sortTime;
	/**
	 * 宝贝状态 1待赠 2已赠     --0已上架 1已撤销
	 */
	private Integer status;
	private String statusName;

	public String getStatusName() {
		if(status==1){
			return "待赠";
		}
		return "已赠";
	}

	/**
	 * 适用年龄
	 */
	private String suitAge;
	/**
	 * 多视频逗号隔开
	 */
	private String videoPath;
	/**
	 * 发布类型 1 真实发布 2 虚拟发布
	 */
	private Integer releaseType;
	private String releaseTypeName;

	public String getReleaseTypeName() {
		if(releaseType==1){
			return "真实发布";
		}
		return "虚拟发布";
	}

	private Date createTime;
}
