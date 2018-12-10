package com.shushan.service.impl;

import com.github.pagehelper.PageHelper;
import com.shushan.dao.UserHandleDao;
import com.shushan.entity.Student;
import com.shushan.service.UserHandleService;
import com.shushan.util.PageBean;
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

    /**
     * 分页查询
     * @param pageNum   当前页数
     * @param pageSize  每页条数
     * @return
     */
    public PageBean<Student> findUserListOfPage(int pageNum, int pageSize) {
        //在分页控制类中设置当前页数，每页条数
        PageHelper.startPage(pageNum, pageSize);
        //查询所有数据，这里的查询不考虑分页，分页插件PageHelper会自动给我们分页
        List<Student> list = userHandleDao.findUserAll();
        PageBean pageBean = PageBean.toPageBean(pageNum, pageSize, list);
        return pageBean;
    }

}
