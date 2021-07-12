package com.geekcat.wiki.service;

import com.geekcat.wiki.domain.Demo;
import com.geekcat.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

// 将当前Service交给Spring Boot管理
@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}
