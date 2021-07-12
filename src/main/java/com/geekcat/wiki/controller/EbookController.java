package com.geekcat.wiki.controller;

import com.geekcat.wiki.domain.Ebook;
import com.geekcat.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    // 每个接口如果都要包含/ebook过于繁琐，可以使用@RequestMapping简化
//    @GetMapping("/ebook/list")
    @GetMapping("/list")
    public List<Ebook> list() {
        return ebookService.list();
    }
}
