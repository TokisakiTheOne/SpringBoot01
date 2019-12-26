package com.yyh.service;

import com.yyh.dao.StudentDao;
import com.yyh.po.ResultMessage;
import com.yyh.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-12-26-10:43
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao sd;
    @Override
    public ResultMessage selectAll() {
        ResultMessage rm = null;
        try {
            List<Student> students = sd.selectAll();
            rm=new ResultMessage(1,"查询成功",students);
        } catch (Exception e) {
            rm=new ResultMessage(5,"查询失败,数据库连接异常或服务器不稳定",null);
        }
        return rm;
    }
}
