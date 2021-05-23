package com.cxb.controller;

import com.cxb.mapper.MvcMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController//前端控制器这里好像还是要用注解+扫描，配置xml的bean好像不管用
public class MvcController {
    @Resource
    private MvcMapper mvcMapper;
    @GetMapping("/test")
    public String test() {
        return "hello spring mvc";
    }
    @GetMapping
    public Map test2() {
        return  mvcMapper.method();
    }
}
