package com.geekcat.wiki.service;

import com.geekcat.wiki.domain.Test;
import com.geekcat.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

// 将当前Service交给Spring Boot管理
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
