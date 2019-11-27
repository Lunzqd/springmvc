package com.lunz.course.dao;

import com.lunz.course.entity.domain.ScheduleInfo;
import org.apache.ibatis.annotations.Param;

/**
  * @author al
  * @date 2019/11/27 10:35
  * @description 
  */
public interface ScheduleInfoMapper {
    int deleteByPrimaryKey(@Param("jobName") String jobName, @Param("triggerName") String triggerName);

    int insert(ScheduleInfo record);

    int insertSelective(ScheduleInfo record);

    ScheduleInfo selectByPrimaryKey(@Param("jobName") String jobName, @Param("triggerName") String triggerName);

    int updateByPrimaryKeySelective(ScheduleInfo record);

    int updateByPrimaryKey(ScheduleInfo record);
}