package com.o2o.utill;

/*
主要提供两类的路径，根据执行环境的不同，提供不同的路径
 */
public class PathUtil {

    //获取系统的文件分割符
    private static String separator = System.getProperty("file.separator");

    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "c:/Users/94071/Desktop/image";
        } else {
            //如果在非windows系统
            basePath = "/home/image/";
        }
        basePath = basePath.replace("/", separator);
        return basePath;
    }

    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/item/shop/" + shopId + "/";
        return imagePath.replace("/", separator);
    }
}
