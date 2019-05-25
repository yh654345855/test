package com.huaxing.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestType {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
        StudentServiceImpl studentService= (StudentServiceImpl)ctx.getBean("a") ;
        studentService.selectStudent();
        System.out.println("提交1dev");
    }
}
