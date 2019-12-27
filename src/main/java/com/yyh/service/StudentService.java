package com.yyh.service;

import com.yyh.po.ResultMessage;
import com.yyh.po.Student;

/**
 * @author YanYuHang
 * @create 2019-12-26-10:17
 */
public interface StudentService {


    ResultMessage selectAll();

    ResultMessage delete(int id);

    ResultMessage findOne(int id);

    ResultMessage update(Student student);

    ResultMessage insert(Student student);

}
