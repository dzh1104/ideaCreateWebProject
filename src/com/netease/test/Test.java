package com.netease.test;

import com.netease.entity.Student;
import com.netease.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

public static void main(String[] args) {
    
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    IStudentService studentService = (IStudentService)context.getBean("studentService");
    Student student = new Student();
    student.setStuNo(23);
    student.setStuName("fsc");
    student.setStuAge(62);
    studentService.addStudent(student);
}
    
}
