package com.qf;

import com.qf.entity.Classes;

import java.util.List;

/**
 * @author：H
 * @date：2019/6/28
 */
public interface IClassesService {
    List<Classes> list();

    Classes getById(int cid);
}
