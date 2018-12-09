package com.shushan.service.impl;

import com.shushan.dao.UserHandleDao;
import com.shushan.entity.Student;
import com.shushan.service.UserHandleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserHandleServiceImpl implements UserHandleService {

    @Resource
    private UserHandleDao userHandleDao;

    /**
     * 通过学号查询学生信息
     * @param code
     * @return
     */
    @Override
    public List<Student> findUserListByCode(String code) {

        return userHandleDao.findUserListByCode(code);
    }

}
