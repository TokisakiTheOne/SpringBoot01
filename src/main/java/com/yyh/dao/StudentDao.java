package com.yyh.dao;

import com.yyh.po.Student;
import org.apache.ibatis.annotations.*;
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


    @Delete("delete from student where stuid=#{id}")
    int delete(int id);

    @ResultMap("stuResult")
    @Select("select * from student where stuid=#{id}")
    Student selectOne(int id);

    @Update("update student set stuname=#{name},stupwd=#{pwd} where stuid=#{id}")
    int update(Student student);

    @Insert("insert into student(stuName,stuPwd) values(#{name},#{pwd})")
    int insert(Student student);
}
