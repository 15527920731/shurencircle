package com.shurencircle.exception;


import com.shurencircle.enums.ResultEnum;
import lombok.Data;

@Data
public class GlobleException extends RuntimeException{
    private Integer code;

    /**
     * 枚举类型
     * @param resultEnum
     */
    public GlobleException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code=resultEnum.getCode();
    }

    /**
     * 错误码，错误信息
     * @param code
     * @param msg
     */
    public GlobleException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }
}
