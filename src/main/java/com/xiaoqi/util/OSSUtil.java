package com.xiaoqi.util;

import com.aliyun.oss.ClientConfiguration;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.auth.DefaultCredentialProvider;
import com.aliyun.oss.model.CannedAccessControlList;
import com.aliyun.oss.model.PutObjectResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@Component
public class OSSUtil {
    @Value("${OSS.point}")
    private static String endPoint="oss-cn-beijing.aliyuncs.com";
    @Value("${OSS.AK}")
    private static String accessKeyId="******";
    @Value("${OSS.AS}")
    private static String accessKeySecret="*****";
    @Value("${OSS.bucketName}")
    private static String bucketName="yangxiaoqi";
    @Value("${File.upload}")
    private static String fileDir="E:\\UploadFiles";
    private static OSSClient ossClient = null;
    private static String FILE_URL;
    public static String upload(MultipartFile file) {
        initOSS(endPoint, accessKeyId, accessKeySecret);
        System.out.println(accessKeyId+"#######");
        StringBuilder fileUrl = new StringBuilder();
        try {
            String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
            String fileName = UUID.randomUUID().toString().replace("-", "") + suffix;
            if (!fileDir.endsWith("/")) {
                fileDir = fileDir.concat("/");
            }
            fileUrl = fileUrl.append(fileDir + fileName);

            FILE_URL = "https://" + bucketName + "." + endPoint + "/" + fileUrl;
            PutObjectResult result = ossClient.putObject(bucketName, fileUrl.toString(), file.getInputStream());
            // 设置权限(公开读)
            ossClient.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);
            if (result != null) {
                System.out.println("------OSS文件上传成功------" + fileUrl);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return FILE_URL;
    }

    /**
     * 初始化OSS容器
     * @param endpoint
     * @param accessKeyId
     * @param accessKeySecret
     * @return
     */
    private static OSSClient initOSS(String endpoint, String accessKeyId, String accessKeySecret) {
        if (ossClient == null) {
            ossClient = new OSSClient(endpoint,
                    new DefaultCredentialProvider(accessKeyId, accessKeySecret),
                    new ClientConfiguration());
        }
        return ossClient;
    }


}
