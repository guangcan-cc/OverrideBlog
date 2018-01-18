package com.blog.util;

import com.blog.exception.NonePrintException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UploadFileUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadFileUtils.class);

    /**
     * 上传文件
     * @param uploadHeadFile
     * @param modelName 模块名称
     * @return
     */
    public static String uploadFile(MultipartFile uploadHeadFile, String modelName) throws NonePrintException {

        //获取上传文件路径
        String filePath = ConfigPropertyUtils.getProperty("img_upload_dir") + modelName;

        //获取后缀名
        String fileName = uploadHeadFile.getOriginalFilename();
        String fileNameExt = fileName.substring(fileName.lastIndexOf("."));

        File modelFile = new File(filePath);
        if(!modelFile.exists()) {
            modelFile.mkdirs();
        }

        //生成空白文件
        File file = new File(modelFile, UUID.randomUUID().toString() + fileNameExt);

        //转换文件，实现上传功能
        try {
            uploadHeadFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new NonePrintException(ErrorCodeDesc.FILE_UPLOAD_ERROR.getCode(),ErrorCodeDesc.FILE_UPLOAD_ERROR.getDesc());
        }

        //返回上传的绝对路径
        return file.getAbsolutePath();
    }
}
