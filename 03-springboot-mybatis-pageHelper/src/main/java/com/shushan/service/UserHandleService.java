package com.shushan.service;

import com.shushan.entity.Student;
import com.shushan.util.PageBean;

import java.util.List;

public interface UserHandleService {

    public List<Student> findUserListByCode(String code);

    public PageBean<Student> findUserListOfPage(int pageNum, int pageSize);

}
