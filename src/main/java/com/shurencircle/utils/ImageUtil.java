package com.shurencircle.utils;


import net.coobird.thumbnailator.Thumbnails;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ImageUtil {


    /**
     * 生成缩略图
     * @param file  上传的文件
     * @param targetAddr  目标文件
     * @return
     */
    public static String generateThumbnail(CommonsMultipartFile file, String targetAddr, String imgBasePath){

        //生成文件名
        String realFileName = FileUtil.getRandomFileName();
        //获取文件的扩展名
        String extension = getFileExtension(file.getName());
        //创建文件路径
        makeDirPath(targetAddr, imgBasePath);
        //文件存储的绝对路径为 存储文件的相对路径+ 生成的文件名+ 文件扩展名
        String relativeAddr = targetAddr + realFileName + extension;
        File dest = new File(FileUtil.getHeadLineImagePath() + relativeAddr);
        try{
            //生成缩略图,并压缩图片
            Thumbnails.of(file.getInputStream()).size(200, 200).outputQuality(0.8f);
        }catch (Exception e){
           // throw new DichanException(ResultEnum.CREATE_THUMBNAIL);
        }
        return relativeAddr;
    }


    /**
     * 上传文件
     * @param file  上传的文件---不压缩
     * @param targetAddr  目标路径---  相对路径   /img
     * @param imgBasePath  图片存储路径---绝对路径  E:/test/shurencircle
     * @return
     */
    public static String generateNormalImg(MultipartFile file, String targetAddr, String imgBasePath) {
        String realFileName = FileUtil.getRandomFileName();
        String extension = getFileExtension(file.getOriginalFilename());
        makeDirPath(targetAddr, imgBasePath);
        //文件存储的绝对路径为 存储文件的相对路径+ 生成的文件名+ 文件扩展名
        String relativeAddr = targetAddr + realFileName + extension;
        File dest = new File(imgBasePath+ relativeAddr);
        try {
          /*  System.out.println("dest"+dest);
            Thumbnails.of(file.getInputStream()).size(337, 640).outputQuality(0.9f).toFile(dest);*/
            FileInputStream fileInputStream = (FileInputStream) file.getInputStream();
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
            byte[] bs = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bs)) != -1) {
                bos.write(bs, 0, len);
            }
            bos.flush();
            bos.close();

        } catch (Exception e) {
            //throw new DichanException(ResultEnum.CREATE_THUMBNAIL);
        }
        return relativeAddr;
    }



    /**
     * 创建目标路径所涉及到的目录
     * @param targetAddr  目标路径---  相对路径   /img
     * @param imgBasePath  图片存储路径---绝对路径  E:/test/shurencircle
     */
    private static void makeDirPath(String targetAddr, String imgBasePath) {
        String realFileParentPath = imgBasePath + targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }
    }

    /**
     * 获取文件后缀
     * @param fileName
     * @return
     */
    private static String getFileExtension(String fileName) {
        //获取文件名.后面的内容
        return fileName.substring(fileName.lastIndexOf("."));
    }

    /**
     * 删除图片
     * @param storePath 存储文件的地址
     * @param imgBasePath 文件的基本路径(在配置文件配置的)
     */
    public static void deleteFile(String storePath, String imgBasePath) {
        File file = new File(imgBasePath + storePath);
        if (file.exists()) {
            //判断此是不是目录路径，如果是就删除此目录下所有东西包括目录本身
            if (file.isDirectory()) {
                File files[] = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    files[i].delete();
                }
            }
            file.delete();
        }
    }
}
