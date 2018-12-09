package com.shushan.dao;

import com.shushan.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserHandleDao {

    public List<Student> findUserListByCode(String code);
}
