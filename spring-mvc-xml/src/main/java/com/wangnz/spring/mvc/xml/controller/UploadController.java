package com.wangnz.spring.mvc.xml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
@RequestMapping("/uploadImg")
public class UploadController {
    private String savePath = "D:\\WNZ\\workspace\\IdeaProjects\\spring\\spring-mvc-xml\\src\\main\\webapp\\fileUpload\\temp\\";

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
                        file.transferTo(new File(filePath));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "ok";
    }
}
