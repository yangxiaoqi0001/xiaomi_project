package com.xiaoqi.contorller;

import com.xiaoqi.pojo.vo.ResultVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : yangfan
 * @Date : 2020/7/1
 **/
@RestController
@RequestMapping("/file")
public class FileContorller {

    @RequestMapping("/upload")
    public ResultVO upload(@RequestParam("file") MultipartFile file){
        return null;
    }
}
