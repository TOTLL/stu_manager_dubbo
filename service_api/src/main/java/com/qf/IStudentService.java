package com.qf;

import com.qf.entity.Student;

import java.util.List;

/**
 * @author：H
 * @date：2019/6/28
 */
public interface IStudentService {
    int add(Student student);

    List<Student> list();
}
