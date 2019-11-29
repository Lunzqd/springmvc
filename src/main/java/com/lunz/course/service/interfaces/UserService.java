package com.lunz.course.service.interfaces;

import com.lunz.course.entity.domain.User;

import java.util.List;

/**
  * @author al
  * @date 2019/11/29 10:49
  * @description 
  */
public interface UserService{


    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findByAll();

}
