package com.shurencircle.exception;


import com.shurencircle.utils.Result;
import com.shurencircle.vo.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalDefultExceptionHandler {

    //声明要捕获的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultVO defultExcepitonHandler(HttpServletRequest request, Exception e) {
        e.printStackTrace();
        if(e instanceof GlobleException) {
            //Log.error(this.getClass(),"业务异常："+e.getMessage());
            GlobleException businessException = (GlobleException)e;
            return Result.error(businessException.getCode(), businessException.getMessage());
        }
        //未知错误
        return Result.error(-1, "系统异常：\\n"+e);
    }


}
