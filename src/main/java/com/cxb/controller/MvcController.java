package com.cxb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//前端控制器这里好像还是要用注解+扫描，配置xml的bean好像不管用
public class MvcController {
    @GetMapping("/test")
    public String test() {
        return "hello spring mvc";
    }
}
