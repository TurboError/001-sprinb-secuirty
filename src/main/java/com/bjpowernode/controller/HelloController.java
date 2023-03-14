package com.bjpowernode.controller;

import com.bjpowernode.entity.Student;
import com.bjpowernode.servlet.StudentServlet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("hello")
public class HelloController {
    @Resource StudentServlet studentServlet;

    @GetMapping("2023")
    public String hello(){
        return "Hello 2023/3/3";
    }
    @GetMapping("hello/{id}")
    public Student hello(@PathVariable(value = "id") Integer id){
        return studentServlet.getStudentById(id);

    }
}
