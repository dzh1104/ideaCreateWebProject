package com.netease.dao.impl;

import com.netease.mapper.StudentMapper;
import com.netease.entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

// 继承该类 SqlSessionDaoSupport，拿到 SqlSession对象
public class StudentMapperImpl extends SqlSessionDaoSupport implements StudentMapper {

@Override
public void addStudent(Student student) {
    
    SqlSession sqlSession = super.getSqlSession();
    StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
    
    mapper.addStudent(student);
}

}
