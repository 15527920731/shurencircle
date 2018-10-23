package com.shurencircle.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class CustomConverter implements Converter<String, Date> {

    // 实现将日期串转换为日期类型
    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                "yyyy-MM-dd");
        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            //e.printStackTrace();
        }
        // 如果参数绑定失败，返回null
        return null;
    }

}
