package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author：H
 * @date：2019/6/28-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classes implements Serializable {

    Integer id;
    String cname;
    Integer csum;
}
