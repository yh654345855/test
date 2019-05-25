package com.huaxing.service;

import com.huaxing.dao.student.StudentDao;
import com.huaxing.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "a")
public class StudentServiceImpl implements StudentService {
   @Resource(name = "StudentDao")
    private StudentDao studentDao;

    @Override
    public void selectStudent() {
       Student student= studentDao.selectStudent();
        System.out.println(student.getName()+"，年龄："+student.getAge());
    }
}
