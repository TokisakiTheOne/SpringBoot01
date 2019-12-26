package com.yyh.dao;

import com.yyh.po.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author YanYuHang
 * @Mapper 注册映射器接口   类似于   basepackage="com.yyh.dao"
 * @create 2019-12-26-10:07
 */
@Mapper
@Repository
public interface StudentDao {

    @Select("select * from student")
    @Results(id = "stuResult", value = {
            @Result(id = true, property = "id", column = "stuId"),
            @Result(property = "name", column = "stuName"),
            @Result(property = "pwd", column = "stuPwd")
    })
    List<Student> selectAll();

}
