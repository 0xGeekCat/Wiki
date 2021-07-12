package com.geekcat.wiki.service;

import com.geekcat.wiki.domain.Ebook;
import com.geekcat.wiki.domain.EbookExample;
import com.geekcat.wiki.mapper.EbookMapper;
import com.geekcat.wiki.req.EbookReq;
import com.geekcat.wiki.resp.EbookResp;
import com.geekcat.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

// 将当前Service交给Spring Boot管理
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        // createCriteria相当于where
        EbookExample.Criteria criteria = ebookExample.createCriteria();

        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        return CopyUtil.copyList(ebookList, EbookResp.class);
    }
}
