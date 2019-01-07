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
    student.setStuNo(67);
    student.setStuName("gg");
    student.setStuAge(45);
    studentService.addStudent(student);
}
    
}
