package com.lunz.course.dao;

import com.lunz.course.entity.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
  * @author al
  * @date 2019/11/29 10:49
  * @description 
  */
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findByAll();
}