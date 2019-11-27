package com.lunz.course.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lunz.course.dao.ScheduleInfoMapper;
import com.lunz.course.entity.domain.ScheduleInfo;
import com.lunz.course.service.interfaces.ScheduleInfoService;
/**
  * @author al
  * @date 2019/11/27 10:35
  * @description 
  */
@Service
public class ScheduleInfoServiceImpl implements ScheduleInfoService{

    @Resource
    private ScheduleInfoMapper scheduleInfoMapper;

    @Override
    public int deleteByPrimaryKey(String jobName,String triggerName) {
        return scheduleInfoMapper.deleteByPrimaryKey(jobName,triggerName);
    }

    @Override
    public int insert(ScheduleInfo record) {
        return scheduleInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(ScheduleInfo record) {
        return scheduleInfoMapper.insertSelective(record);
    }

    @Override
    public ScheduleInfo selectByPrimaryKey(String jobName,String triggerName) {
        return scheduleInfoMapper.selectByPrimaryKey(jobName,triggerName);
    }

    @Override
    public int updateByPrimaryKeySelective(ScheduleInfo record) {
        return scheduleInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ScheduleInfo record) {
        return scheduleInfoMapper.updateByPrimaryKey(record);
    }

}
