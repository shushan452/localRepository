package com.shushan.controller;

import com.shushan.entity.Student;
import com.shushan.service.UserHandleService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/userHandle")
public class UserHandle {

    @Resource
    private UserHandleService userHandleService;

    /**
     * 通过学号查询学生信息
     * @param code
     * @return
     */
    @RequestMapping("/findUserListByCode/{code}")
    public List<Student> findUserListByCode(@PathVariable("code") String code){
        return userHandleService.findUserListByCode(code);
    }


}
