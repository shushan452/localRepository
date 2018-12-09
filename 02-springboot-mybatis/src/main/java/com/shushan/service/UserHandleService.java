package com.shushan.service;

import com.shushan.entity.Student;

import java.util.List;

public interface UserHandleService {

    public List<Student> findUserListByCode(String code);

}
