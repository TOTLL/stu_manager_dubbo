package com.qf.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.IClassesService;
import com.qf.IStudentService;
import com.qf.dao.StuMapper;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author：H
 * @date：2019/6/28
 */
@Service
public class StuServiceImpl implements IStudentService {

    @Autowired
    StuMapper stuMapper;
    @Reference
    IClassesService classesService;
    @Override
    public int add(Student student) {
        return stuMapper.insert(student);
    }

    @Override
    public List<Student> list() {
        List<Student> list = stuMapper.selectList(null);
        for (Student student : list) {
            Classes classes =classesService.getById(student.getCid());
            student.setClasses(classes);
        }
        return list;
    }
}

