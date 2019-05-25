package com.huaxing.dao.student;

import com.huaxing.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository(value = "StudentDao")
public interface StudentDao {

     Student selectStudent();
}
