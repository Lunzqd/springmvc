package com.lunz.course.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lunz.course.entity.domain.User;
import com.lunz.course.dao.UserMapper;
import com.lunz.course.service.interfaces.UserService;

import java.util.List;

/**
  * @author al
  * @date 2019/11/29 10:49
  * @description 
  */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> findByAll() {
        return userMapper.findByAll();
    }

}
