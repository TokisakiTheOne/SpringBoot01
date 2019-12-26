package com.yyh.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanYuHang
 * @create 2019-12-26-9:07
 */
@RestController
public class SpringHandler {
    @RequestMapping("/test")
    public String test(){
        return "Hello  SpringBoot!!!!!!!!";
    }
}






