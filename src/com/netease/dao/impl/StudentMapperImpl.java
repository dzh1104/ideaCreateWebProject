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
    
    // 在mybatis中由于事务提交类型是 JDBC，所以要手动提交；而在此处不需要手动提交，因为spring会自动提交
    sqlSession.commit();
}

}
