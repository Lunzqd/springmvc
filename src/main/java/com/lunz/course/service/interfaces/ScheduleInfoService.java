package com.lunz.course.service.interfaces;

import com.lunz.course.entity.domain.ScheduleInfo;
    /**
  * @author al
  * @date 2019/11/27 10:35
  * @description 
  */
public interface ScheduleInfoService{


    int deleteByPrimaryKey(String jobName,String triggerName);

    int insert(ScheduleInfo record);

    int insertSelective(ScheduleInfo record);

    ScheduleInfo selectByPrimaryKey(String jobName,String triggerName);

    int updateByPrimaryKeySelective(ScheduleInfo record);

    int updateByPrimaryKey(ScheduleInfo record);

}
