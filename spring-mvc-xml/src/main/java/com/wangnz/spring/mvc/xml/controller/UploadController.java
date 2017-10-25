package com.wangnz.spring.mvc.xml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Controller
@RequestMapping("/uploadImg")
public class UploadController {
    private String savePath = "D:\\WNZ\\";

    @RequestMapping(value = "/uploadPage", method = RequestMethod.GET)
    public String uploadPage() {
        return "uploadPage";
    }

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile(HttpServletRequest request, @RequestParam("files") MultipartFile[] files) {
        // 文件保存路径
        String path = savePath;
        //request.getSession().getServletContext().getRealPath("/") + "fileUpload/temp/";
        try {
            if (files != null && files.length > 0) {
                // 循环获取file数组中得文件
                for (int i = 0; i < files.length; i++) {
                    MultipartFile file = files[i];

                    if (!file.isEmpty()) {
                        String fileName = file.getOriginalFilename();
                        int pos = fileName.lastIndexOf(".");
                        String fileType = fileName.substring(pos);
                        String filePath = path + "123" + "_" + i + fileType;
                        //保存文件

                        ByteArrayInputStream fis1 = (ByteArrayInputStream) file.getInputStream();
                        byte[] fileBuff1 = null;

                        if (fis1 != null) {
                            int len = fis1.available();
                            fileBuff1 = new byte[len];
                            fis1.read(fileBuff1);
                        }


                        File fdsFile = new File("D://WNZ//JJD201707277615738171046_0.png");
                        FileInputStream fis2 = new FileInputStream(fdsFile);
                        byte[] fileBuff2 = null;

                        if (fis2 != null) {
                            int len = fis2.available();
                            fileBuff2 = new byte[len];
                            fis2.read(fileBuff2);
                        }
                        System.out.println("1");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "ok";
    }
}
