package com.lunz.course.entity.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
  * @author al
  * @date 2019/11/27 10:35
  * @description 
  */
@Data
public class ScheduleInfo implements Serializable {
    /**
    * 任务名称
    */
    private String jobName;

    /**
    * 触发器名称
    */
    private String triggerName;

    /**
    * 任务所在组名
    */
    private String jobGroupName;

    /**
    * 触发器所在组名
    */
    private String triggerGroupName;

    /**
    * 任务类名
    */
    private String jobClassName;

    /**
    * cron表达式
    */
    private String cron;

    /**
    * 任务状态（NONE: 不存在，NORMAL: 正常，PAUSED: 暂停，COMPLETE:完成，ERROR : 错误）
    */
    private String triggerStatus;

    /**
    * 任务创建时间
    */
    private Date crtTime;

    /**
    * 任务更新时间
    */
    private Date updTime;

    /**
    * 创建任务人ID
    */
    private String crtId;

    /**
    * 更新任务人ID
    */
    private String updId;

    private static final long serialVersionUID = 1L;
}