package com.bjpowernode.dao;

import com.bjpowernode.entity.Student;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StudentMapper {
    Student getStudentById(Integer id);
}
