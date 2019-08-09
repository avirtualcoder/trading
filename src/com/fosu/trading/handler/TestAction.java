package com.fosu.trading.handler;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.fosu.trading.po.Goods;

@Controller
public class TestAction {
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
    // 这里的MultipartFile对象变量名跟表单中的file类型的input标签的name相同，所以框架会自动用MultipartFile对象来接收上传过来的文件，当然也可以使用@RequestParam("img")指定其对应的参数名称
    public String upload(@RequestParam MultipartFile img)
            throws Exception {
		System.out.println("进入了上传控制器");
        // 如果没有文件上传，MultipartFile也不会为null，可以通过调用getSize()方法获取文件的大小来判断是否有上传文件
        if (img.getSize() > 0) {
            // 得到项目在服务器的真实根路径，如：/home/tomcat/webapp/项目名/images
            String path = "D:\\视频库\\产业班视频\\workplace\\trading\\WebContent\\image\\goodsImg";
            // 得到文件的原始名称，如：美女.png
            String fileName = img.getOriginalFilename();
            // 通过文件的原始名称，可以对上传文件类型做限制，如：只能上传jpg和png的图片文件
            if (fileName.endsWith("jpg") || fileName.endsWith("png")) {
//                String newFileName=goods.getId();
            	File file = new File(path, fileName);
                img.transferTo(file);
                return "/seller/test";
            }
        }
        return "/seller/test";
    }
}

	

