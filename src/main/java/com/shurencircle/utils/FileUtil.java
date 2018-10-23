package com.shurencircle.utils;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * FileUtil class
 *
 * @author tianjun
 * @date 18-4-7
 */
public class FileUtil {

    /**
     * 获取操作系统的文件分隔符
     */
    private static String seperator = System.getProperty("file.separator");

    /**
     * 设置头条文件的相对路径
     * @return
     */
    public static String getHeadLineImagePath() {
        String headLineImagePath = "/item/headline/";
        headLineImagePath = headLineImagePath.replace("/", seperator);
        return headLineImagePath;
    }

    /**
     * 为了将不同登记单分别存放图片(获取相对路径)
     * @return
     */
    public static String getRegistrationImagePath() {

        String RegistrationImagePath = "/item/registration/";
        RegistrationImagePath = RegistrationImagePath.replace("/", seperator);
        return RegistrationImagePath;
    }


    /**
     * 生成随机的文件夹名
      * @return
     */
    public static String getRandomFileName() {
        // 生成随机文件名：当前年月日时分秒+五位随机数（为了在实际项目中防止文件同名而进行的处理）
        // 获取随机数
        final Random r = new Random();
        int rannum = (int) (r.nextDouble() * (99999 - 10000 + 1)) + 10000;
        // 当前时间
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String nowTime =format.format(currentTimeMillis);
        return nowTime + rannum;
    }


    public static void main(String[] args) {
        System.out.println("文件名"+getRandomFileName());
    }
}
