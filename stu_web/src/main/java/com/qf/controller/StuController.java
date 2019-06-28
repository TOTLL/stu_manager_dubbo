package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.IClassesService;
import com.qf.IStudentService;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author：H
 * @date：2019/6/28-20
 */
@Controller
@RequestMapping("stu")
public class StuController {

    @Reference
    IClassesService classesService;
    @Reference
    IStudentService studentService;

    @RequestMapping("toadd")
    public String toadd(Model model){
        List<Classes> list = classesService.list();
        model.addAttribute("list",list);
        return "stuadd";
    }
    @RequestMapping("add")
    public String add(Student student){
        studentService.add(student);
        return "index";
    }

    @RequestMapping("list")
    public String list(Model model){
        List<Student> list=studentService.list();
        model.addAttribute("list",list);
        return "stulist";
    }
}
