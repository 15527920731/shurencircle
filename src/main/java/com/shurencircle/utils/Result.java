package com.shurencircle.utils;


import com.shurencircle.enums.ResultEnum;
import com.shurencircle.vo.ResultVO;

/**
 * 返回前端格式化数据类
 * Result class
 */
public class Result {
    /**
     * 成功时返回
     * @param object 实体类
     * @return
     */
    public static ResultVO success(Object object){
        ResultVO result= new ResultVO();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    /**
     * 成功返回，并返回数据总记录数,页数
     * @param object
     * @param pages 总页数
     * @return
     */
    public static ResultVO success(Object object,int pages){
        ResultVO result= new ResultVO();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        //设置页数
        result.setPages(pages);
        return result;
    }

    /**
     * 成功返回，并传递数据总记录数,页数
     * @param object
     * @param total 数据总记录数
     * @param pages 总页数
     * @return
     */
    public static ResultVO success(Object object,int total,int pages){
        ResultVO result= new ResultVO();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        //设置总记录数
        result.setTotal(total);
        //设置页数
        result.setPages(pages);
        return result;
    }

    /**
     * 成功时返回
     * @return
     */
    public static ResultVO success() {
        return success(null);
    }

    /**
     * 失败时返回
     * @param code 错误编码
     * @param msg 错误信息
     * @return
     */
    public static ResultVO error(Integer code, String msg){
        ResultVO result= new ResultVO();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    /**
     * 失败时返回
     * @param resultEnum 枚举
     * @return
     */
    public static ResultVO error(ResultEnum resultEnum){
        ResultVO result= new ResultVO();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        return result;
    }




}
