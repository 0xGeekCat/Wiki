package com.geekcat.wiki.service;

import com.geekcat.wiki.domain.Ebook;
import com.geekcat.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

// 将当前Service交给Spring Boot管理
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
