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
            rm = new ResultMessage(1, "查询成功", students);
        } catch (Exception e) {
            rm = new ResultMessage(5, "查询失败,数据库连接异常或服务器不稳定", null);
        }
        return rm;
    }

    @Override
    public ResultMessage delete(int id) {
        ResultMessage rm = null;
        try {
            if (sd.delete(id) > 0) {
                rm = new ResultMessage(1, "删除成功", null);
            } else {
                rm = new ResultMessage(5, "删除失败,数据库连接异常或服务器不稳定", null);
            }
        } catch (Exception e) {
            rm = new ResultMessage(5, "删除失败,数据库连接异常或服务器不稳定", null);
        }
        return rm;
    }

    @Override
    public ResultMessage findOne(int id) {
        ResultMessage rm = null;
        try {
            Student student = sd.selectOne(id);
            rm = new ResultMessage(1, "查询成功", student);
        } catch (Exception e) {
            rm = new ResultMessage(5, "查询失败,数据库连接异常或服务器不稳定", null);
        }
        return rm;
    }

    @Override
    public ResultMessage update(Student student) {
        ResultMessage rm = null;
        try {
            if (sd.update(student) > 0) {
                rm = new ResultMessage(1, "修改成功", null);
            } else {
                rm = new ResultMessage(5, "修改失败,数据库连接异常或服务器不稳定", null);
            }
        } catch (Exception e) {
            rm = new ResultMessage(5, "修改失败,数据库连接异常或服务器不稳定", null);
        }
        return rm;
    }

    @Override
    public ResultMessage insert(Student student) {
        ResultMessage rm = null;
        try {
            if (sd.insert(student) > 0) {
                rm = new ResultMessage(1, "新增成功", null);
            } else {
                rm = new ResultMessage(5, "新增失败,数据库连接异常或服务器不稳定", null);
            }
        } catch (Exception e) {
            rm = new ResultMessage(5, "新增失败,数据库连接异常或服务器不稳定", null);
        }
        return rm;
    }
}
