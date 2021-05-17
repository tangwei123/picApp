package com.lzmes.pic.controller;

import com.lzmes.pic.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: tangwei
 * @Date: 2021/5/17 上午9:58
 * @Description: 类描述信息
 */
@RestController
public class IndexController {

    @Autowired
    public IndexService indexService;

    @GetMapping("/index")
    public String index(){
        return indexService.index();
    }
}
