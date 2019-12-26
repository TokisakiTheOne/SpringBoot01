package com.yyh.handler;

import com.yyh.po.ResultMessage;
import com.yyh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanYuHang
 * @create 2019-12-26-10:49
 */
@RestController
public class StudentHandler {

    @Autowired
    private StudentService ss;

    @RequestMapping("/")
    public ResultMessage selectAll() {
        return ss.selectAll();
    }
}
