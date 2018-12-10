package com.shushan.dao;

import com.shushan.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserHandleDao {

    /**
     * 通过code查询学生机会
     * @param code
     * @return
     */
    public List<Student> findUserListByCode(String code);

    /**
     * 通过条件查询学生集合
     * @param
     * @return
     */
    public List<Student> findUserAll();

}
