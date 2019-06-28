package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author：H
 * @date：2019/6/28-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
@TableId(type = IdType.AUTO)
    Integer id;
    String name;
    String age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date birthday;
    Integer cid;
@TableField(exist = false)
    Classes classes;
}
