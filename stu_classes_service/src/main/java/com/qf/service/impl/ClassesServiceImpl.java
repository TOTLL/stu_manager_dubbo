package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.IClassesService;
import com.qf.dao.ClassesMapper;
import com.qf.entity.Classes;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author：H
 * @date：2019/6/28
 */
@Service
public class ClassesServiceImpl implements IClassesService {

    @Autowired
    ClassesMapper classesMapper;

    @Override
    public List<Classes> list() {
        return classesMapper.selectList(null);
    }

    @Override
    public Classes getById(int cid) {
        return classesMapper.selectById(cid);
    }
}

