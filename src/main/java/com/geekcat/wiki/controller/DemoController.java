package com.geekcat.wiki.controller;

import com.geekcat.wiki.domain.Demo;
import com.geekcat.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    // 每个接口如果都要包含/demo过于繁琐，可以使用@RequestMapping简化
//    @GetMapping("/demo/list")
    @GetMapping("/list")
    public List<Demo> list() {
        return demoService.list();
    }
}
