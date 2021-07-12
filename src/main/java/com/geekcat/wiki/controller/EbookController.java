package com.geekcat.wiki.controller;

import com.geekcat.wiki.req.EbookReq;
import com.geekcat.wiki.resp.CommonResp;
import com.geekcat.wiki.resp.EbookResp;
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
    public CommonResp list(EbookReq req) {
        // 实际开发中是不可以直接把所有信息如List<Ebook>这样直接承接给前端的，还需要一个单独封装的请求类
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
