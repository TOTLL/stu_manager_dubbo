package com.qf.stu_sevice_student;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
@DubboComponentScan("com.qf.service")
public class StuSeviceStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuSeviceStudentApplication.class, args);
    }

}
