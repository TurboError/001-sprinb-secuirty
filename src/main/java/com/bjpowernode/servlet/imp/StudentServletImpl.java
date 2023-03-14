package com.bjpowernode.servlet.imp;

import com.bjpowernode.dao.StudentMapper;
import com.bjpowernode.entity.Student;
import com.bjpowernode.servlet.StudentServlet;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServletImpl implements StudentServlet {

    @Resource
     private StudentMapper studentMapper;
    @Override
    public Student getStudentById(Integer id) {

        return studentMapper.getStudentById(id);
    }
}
