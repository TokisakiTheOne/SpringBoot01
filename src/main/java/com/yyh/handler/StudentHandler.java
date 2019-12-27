package com.yyh.handler;

import com.yyh.dao.StudentDao;
import com.yyh.po.ResultMessage;
import com.yyh.po.Student;
import com.yyh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanYuHang
 * @create 2019-12-26-10:49
 */
@Controller
public class StudentHandler {

    @Autowired
    private StudentService ss;

    @RequestMapping("/")
    public String selectAll(Model model) {
        model.addAttribute("rm", ss.selectAll());
        return "index";
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public ResultMessage selectAll() {
        return ss.selectAll();
    }
    @RequestMapping("/delete")
    @ResponseBody
    public ResultMessage delete(int id) {
        return ss.delete(id);
    }

    @RequestMapping("/findOne")
    @ResponseBody
    public ResultMessage findOne(int id) {
        System.out.println(id);
        return ss.findOne(id);
    }
    @RequestMapping("/update")
    @ResponseBody
    public ResultMessage update(Student student) {
        return ss.update(student);
    }


    @RequestMapping("/insert")
    @ResponseBody
    public ResultMessage insert(Student student) {
        return ss.insert(student);
    }

}
