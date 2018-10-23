package com.shurencircle.vo;


import lombok.Data;


/**
 * 返回前端VO类
 * ResultVO<T> class
 */
@Data
public class ResultVO {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 状态信息
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;

    /**
     * 数据总记录数
     */
    private Integer total;

    /**
     * 分页的页数
     */
    private Integer pages;

}
