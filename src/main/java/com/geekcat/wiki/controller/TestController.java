package com.geekcat.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// @RestController用于返回字符串的控制器，其实质为@Controller+@ResponseBody
// @ResponseBody用来返回字符串或JSON对象
// @Controller返回的则是页面，由于现在常见前后端分离，其基本不使用
@RestController
public class TestController {

    // Restful风格的HTTP请求对应的就是增POST、删DELETE、改PUT、查GET
    // @RequestMapping用于映射请求，即指定控制器可以处理哪些URL请求，其支持所有的请求方式，也可以指定请求
//    @RequestMapping("/hello")
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    // 状态码405表示页面不支持当前请求
    @GetMapping("/hello")
    public String Hello() {
        return "Hello World";
    }
}
