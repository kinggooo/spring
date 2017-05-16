package com.wangnz.java.test;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

public class TestBase64 {
    private static String str = "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";

    public static void main(String[] args) {
//        System.out.println("hello");
//        String encodeStr = GetImageStr();
//        System.out.println(encodeStr);
        String path = "d://2.jpg";
        generateImage(str, path);
//        String encodeStr = getImageStr(path);
//        System.out.println(encodeStr);
//        saveImage(str, path);
    }

    //图片转化成base64字符串
    public static String getImageStr(String path) {
        //将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        String imgFile = path;//待处理的图片
        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try {
            in = new FileInputStream(imgFile);
            System.out.println(in.available());
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);//返回Base64编码过的字节数组字符串
    }

    //base64字符串转化成图片
    public static boolean generateImage(String imgStr, String path) {
        //对字节数组字符串进行Base64解码并生成图片
        if (imgStr == null) {
            //图像数据为空
            return false;
        }
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            //Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {//调整异常数据
                    b[i] += 256;
                }
            }
            //生成jpeg图片
            String imgFilePath = path;//新生成的图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean saveImage(String imgBase64, String path) {
        if (imgBase64 == null)
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // 解密
            byte[] b = decoder.decodeBuffer(imgBase64);
            // 处理数据
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }
            OutputStream out = new FileOutputStream(path);

            out.write(b);
            out.flush();
            out.close();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
