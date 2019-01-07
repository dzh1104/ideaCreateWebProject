package com.netease.service.impl;

import com.netease.entity.Student;
import com.netease.mapper.StudentMapper;
import com.netease.service.IStudentService;

public class IStudentServiceImpl implements IStudentService {

private StudentMapper studentMapper;

public void setStudentMapper(StudentMapper studentMapper) {
    
    this.studentMapper = studentMapper;
}

@Override
public void addStudent(Student student) {
    // 调用DAO
    studentMapper.addStudent(student);
}

}
