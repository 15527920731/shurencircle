package com.shurencircle.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    CREATED_FAIL(100001,"添加失败"),
    ACCEPTED_FAIL(100002,"更新失败"),
    DELETE_FAIL_EXCEPTION(100003, "删除数据异常"),

    DELETE_FAIL_NODATA(100004, "删除数据失败"),
    IS_EXIST(100005, "用户已存在");



    private Integer code;
    private String msg;
    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
